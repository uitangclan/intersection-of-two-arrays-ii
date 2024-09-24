fun main (){
    // var nums1 = intArrayOf(1,2,2,1)
    // var nums2 = intArrayOf(2,2)
    var nums1 = intArrayOf(4,9,5)
    var nums2 = intArrayOf(9,4,9,8,4)
    println(intersect(nums1, nums2).contentToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

    nums1.sort()
    nums2.sort()

    var i = 0
    var j = 0
    var k = 0

    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] < nums2[j]) {
            i++
        } else if (nums2[j] < nums1[i]) {
            j++
        } else {
            nums1[k++] = nums1[i++]
            j++
        }
    }
    return nums1.copyOfRange(0, k)
}
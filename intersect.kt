fun main (){
    // var nums1 = intArrayOf(1,2,2,1)
    // var nums2 = intArrayOf(2,2)
    var nums1 = intArrayOf(4,9,5)
    var nums2 = intArrayOf(9,4,9,8,4)
    println(intersect(nums1, nums2).contentToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

    var map = HashMap<Int, Int> ()

    for(n in nums1) {
        map.put(n, map.getOrDefault(n, 0) + 1)
    }
    var k = 0
    for(n in nums2) {
        var cnt = map.getOrDefault(n, 0)
        if (0 < cnt) {
            nums1[k++] = n
            map.put(n, cnt - 1)
        }
    }
    return nums1.copyOfRange(0, k)
}


function change(n) {
    // 先隐藏所有窗口
    $('#create-div')[0].style.display = "none";
    $('#all-div')[0].style.display = "none";
    // 去掉所有选中项颜色
    for (var i = 0; i < 5; ++i) {
        $('#operation-selection')[0].children[i].style.backgroundColor = "";
    }


    switch (n) {
        case 1 :
            $('#create-div')[0].style.display = "block";
            $('#operation-selection')[0].children[0].style.backgroundColor = "orange";
            break;

        case 5 :
            $('#all-div')[0].style.display = "block";
            $('#operation-selection')[0].children[4].style.backgroundColor = "orange";

            break;

        default :
            break;

    }
}
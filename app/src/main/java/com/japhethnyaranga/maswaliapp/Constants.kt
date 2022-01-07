package com.japhethnyaranga.maswaliapp

object Constants{

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQustions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"Which country does this flag belong to?",R.drawable.kenya,"Nigeria","Uganda", "Kenya", "Somalia",3)
        questionsList.add(que1)

        val que2 = Question(2,"Which country does this flag belong to?",R.drawable.algeria,"Algeria","Nigeria", "SouthAfrica", "Sudan",1)
        questionsList.add(que2)

        val que3 = Question(3,"Which country does this flag belong to?",R.drawable.zimbabwe,"Angola","Zimbabwe", "Egypt", "Cameroon",2)
        questionsList.add(que3)

        val que4 = Question(4,"Which country does this flag belong to?",R.drawable.benin,"Botswana","Chad", "Djibouti", "Benin",4)
        questionsList.add(que4)


        val que5 = Question(5,"Which country does this flag belong to?",R.drawable.zambia,"Zambia","Sierra Leon", "Somalia", "Tanzania",1)
        questionsList.add(que5)

        val que6 = Question(6,"Which country does this flag belong to?",R.drawable.botswana,"Eritrea","Ghana", "Botswana", "Guinea",3)
        questionsList.add(que6)

        val que7 = Question(7,"Which country does this flag belong to?",R.drawable.westernsahara,"Uganda","WesternSahara", "Tunisia", "Togo",2)
        questionsList.add(que7)

        val que8 = Question(8,"Which country does this flag belong to?",R.drawable.bukinafaso,"Equatorial Guinea","Congo Democratic Rep", "Chad", "BurkinaFaso",4)
        questionsList.add(que8)

        val que9 = Question(9,"Which country does this flag belong to?",R.drawable.uganda,"Uganda","Niger", "Lesotho", "Liberia",1)
        questionsList.add(que9)

        val que10 = Question(10,"Which country does this flag belong to?",R.drawable.burundi,"Senegal","Malawi", "Burundi", "Libya",3)
        questionsList.add(que10)

        val que11 = Question(11,"Which country does this flag belong to?",R.drawable.tunisia,"Sudan","Tunisia", "Swaziland", "Sudan",2)
        questionsList.add(que11)

        val que12 = Question(12,"Which country does this flag belong to?",R.drawable.cameroon,"Uganda","Djibouti", "Chad", "Cameroon",4)
        questionsList.add(que12)

        val que13 = Question(13,"Which country does this flag belong to?",R.drawable.capeverde,"Cabo Verde","Ethiopia", "Kenya", "Cote d'Ivore",1)
        questionsList.add(que13)

        val que14 = Question(14,"Which country does this flag belong to?",R.drawable.tanzania,"Somalia","Zambia", "Western Sahara", "Tanzania",4)
        questionsList.add(que14)


        val que15 = Question(15,"Which country does this flag belong to?",R.drawable.swaziland,"Namibia","Rwanda", "Reunion", "Swaziland",4)
        questionsList.add(que15)

        val que16 = Question(16,"Which country does this flag belong to?",R.drawable.sudan,"Senegal","Sudan", "Nigeria", "Malawi",2)
        questionsList.add(que16)

        val que17 = Question(17,"Which country does this flag belong to?",R.drawable.southsudan,"South Sudan","Sudan", "Morocco", "Angola",1)
        questionsList.add(que17)



        val que18 = Question(18,"Which country does this flag belong to?",R.drawable.southafrica,"Niger","Senegal", "South Africa", "Mali",3)
        questionsList.add(que18)





        val que19 = Question(19,"Which country does this flag belong to?",R.drawable.centralafricanrepublic,"Togo","Central African Republic", "Ethiopia", "Namibia",2)
        questionsList.add(que19)





        val que20 = Question(20,"Which country does this flag belong to?",R.drawable.somalia,"Lesotho","Botswana", "Gambia", "Somalia",4)
        questionsList.add(que20)





        val que21 = Question(21,"Which country does this flag belong to?",R.drawable.chad,"Ethiopia","Djibouti", "Chad", "Comoros",3)
        questionsList.add(que21)




        val que22 = Question(22,"Which country does this flag belong to?",R.drawable.comoros,"Comoros","Seychelles", "Egypt", "Dr Congo",1)
        questionsList.add(que22)




        val que23 = Question(23,"Which country does this flag belong to?",R.drawable.congodemocraticrep,"Democratic Republic Of Congo","Algeria", "Ghana", "Niger",1)
        questionsList.add(que23)




        val que24 = Question(24,"Which country does this flag belong to?",R.drawable.republicofcongo,"Zimbabwe","Niger", "Republic Of Congo", "Madagascar",3)
        questionsList.add(que24)




        val que25 = Question(25,"Which country does this flag belong to?",R.drawable.sierraleonne,"Mozambique","Guinea", "Rwanda", "Sierra Leone",4)
        questionsList.add(que25)



        val que26 = Question(26,"Which country does this flag belong to?",R.drawable.sychelles,"Seychelles","Burkina Faso", "Angola", "Egypt",1)
        questionsList.add(que26)



        val que27 = Question(27,"Which country does this flag belong to?",R.drawable.cotedivore,"Chad","Cote d'ivore", "Malawi", "Mali",2)
        questionsList.add(que27)



        val que28 = Question(28,"Which country does this flag belong to?",R.drawable.djibouti,"Libya","Tunisia", "Guinea Bissau", "Djibouti",4)
        questionsList.add(que28)



        val que29 = Question(29,"Which country does this flag belong to?",R.drawable.egypt,"Lesotho","Egypt", "Eritrea", "Liberia",2)
        questionsList.add(que29)



        val que30 = Question(30,"Which country does this flag belong to?",R.drawable.senegal,"Senegal","Gabon", "Eswatini", "Cape Verde",1)
        questionsList.add(que30)



        val que31 = Question(31,"Which country does this flag belong to?",R.drawable.saotome,"Libya","Namibia", "Sa Tome & Principe", "Central African Republic",3)
        questionsList.add(que31)




        val que32 = Question(32,"Which country does this flag belong to?",R.drawable.rwanda,"Lesotho","Rwanda", "Gabon", "Eswatini",2)
        questionsList.add(que32)




        val que33 = Question(33,"Which country does this flag belong to?",R.drawable.senegal,"Senegal","Gabon", "Eswatini", "Cabo Verde",1)
        questionsList.add(que33)




        val que34 = Question(34,"Which country does this flag belong to?",R.drawable.nigeria,"Nigeria","Niger", "Togo", "Chad",1)
        questionsList.add(que34)



        val que35 = Question(35,"Which country does this flag belong to?",R.drawable.equitorialguinea,"Burundi","Rwanda", "Equatorial Guinea", "Tunisia",3)
        questionsList.add(que35)




        val que36 = Question(36,"Which country does this flag belong to?",R.drawable.eritrea,"Chad","Eritrea", "Ghana", "Cameroon",2)
        questionsList.add(que36)




        val que37 = Question(37,"Which country does this flag belong to?",R.drawable.niger,"Niger","Angola", "Algeria", "Nigeria",1)
        questionsList.add(que37)



        val que38 = Question(38,"Which country does this flag belong to?",R.drawable.ethiopia,"Mozambique","Ethiopia", "Chad", "Tunisia",2)
        questionsList.add(que38)



        val que39 = Question(39,"Which country does this flag belong to?",R.drawable.gabon,"Congo","Gabon", "Guinea", "Zambia",2)
        questionsList.add(que39)




        val que40 = Question(40,"Which country does this flag belong to?",R.drawable.namibia,"Guinea","Namibia", "Eswatini", "Morocco",2)
        questionsList.add(que40)

        val que41 = Question(41,"Which country does this flag belong to?",R.drawable.mozambique,"Kenya","Angola", "Mozambique", "Morocco",3)
        questionsList.add(que41)


        val que42 = Question(42,"Which country does this flag belong to?",R.drawable.morocco,"Burkina Fas0","Ethiopia", "Nigeria", "Morocco",4)
        questionsList.add(que42)


            val que43 = Question(43,"Which country does this flag belong to?",R.drawable.gambia,"Gambia","Niger", "Malawi", "Benin",1)
        questionsList.add(que43)


        val que44 = Question(44,"Which country does this flag belong to?",R.drawable.ghana,"Senegal","Liberia", "Ghana", "Tunisia",3)
        questionsList.add(que44)

        val que45 = Question(45,"Which country does this flag belong to?",R.drawable.guinea,"Nigeria","Angola", "Burundi", "Guinea",4)
        questionsList.add(que45)


        val que46 = Question(46,"Which country does this flag belong to?",R.drawable.guineabissau,"Guinea Bissau","Kenya", "Tanzania", "Guinea",1)
        questionsList.add(que46)



        val que47 = Question(47,"Which country does this flag belong to?",R.drawable.madagascar,"Sudan","Mozambique", "Madagascar", "Zambia",3)
        questionsList.add(que47)



        val que48 = Question(48,"Which country does this flag belong to?",R.drawable.malawi,"Malawi","Somalia", "Chad", "Zimbabwe",1)
        questionsList.add(que48)



        val que49 = Question(49,"Which country does this flag belong to?",R.drawable.lesoho,"Sudan","Libya", "Lesotho", "Tunisia",3)
        questionsList.add(que49)



        val que50 = Question(50,"Which country does this flag belong to?",R.drawable.mali,"Eritrea","Mali", "Benin", "Tunisia",2)
        questionsList.add(que50)







        val que51 = Question(51,"Which country does this flag belong to?",R.drawable.liberia,"Liberia","Comoros", "Togo", "Zimbabwe",1)
        questionsList.add(que51)




            val que52 = Question(52,"Which country does this flag belong to?",R.drawable.mauritania,"Angola","Mali", "Mauritania", "Zambia",3)
        questionsList.add(que52)




        val que53 = Question(53,"Which country does this flag belong to?",R.drawable.libya,"Libya","Namibia", "Eswatini", "Seychelles",1)
        questionsList.add(que53)


        val que54 = Question(54,"Which country does this flag belong to?",R.drawable.mauritus,"Sierra Leone","Mauritania", "Botswana", "Mauritius",4)
        questionsList.add(que54)





        return questionsList
    }
}
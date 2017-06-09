# AndroidExamples
We will try to learn all the basic android examples together

## Send To Email Code

				String smsNumber="05460000000";
                String smsText=getName+" "+getSurname;

                Uri uri=Uri.parse("smsto:"+smsNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body",smsText);
                startActivity(intent);
## How to Run Example

  
     @Override
    protected void onCreate(Bundle savedInstanceState) {	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnTikla=(Button)findViewById(R.id.btnTikla);
        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=(EditText) findViewById(R.id.editText);    						// getText in EditView
                String getName=name.getText().toString();
                EditText surname=(EditText) findViewById(R.id.editText2);						// getText in EditView
                String getSurname=surname.getText().toString();

                String smsNumber="05460000000";													//and number to send message
                String smsText=getName+" "+getSurname;											//Message

                Uri uri=Uri.parse("smsto:"+smsNumber);											//Convert number to Uri
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body",smsText);
                startActivity(intent);															//-Done-


            }
        });
    }
    

   

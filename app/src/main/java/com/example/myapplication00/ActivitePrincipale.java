package com.example.myapplication00;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitePrincipale extends AppCompatActivity {
    String finalCalcul = "";
    String chiffreEnCours = "";
    Ops multiplicateur;
    boolean isMultiplicateur = false;
    float resultat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_substract = findViewById(R.id.button_substract);
        button_substract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("-", finalCalcul);
                resultat = doCalcul(resultat, multiplicateur, chiffreEnCours);
                multiplicateur = Ops.MOINS;
                chiffreEnCours = "";
                totalCalcul.setText(finalCalcul);
                chiffre.setText("");
            }
        });

        Button button_delete = findViewById(R.id.button_delete);
        button_delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                chiffre.setText("");
                totalCalcul.setText("");
                finalCalcul = "";
                chiffreEnCours = "";
            }
        });

        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = removeElementToText(finalCalcul);
                chiffreEnCours = removeElementToText(chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_pourcentage = findViewById(R.id.button_puissance);
        button_pourcentage.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("^", finalCalcul);
                resultat = doCalcul(resultat, multiplicateur, chiffreEnCours);
                multiplicateur = Ops.PUISSANCE;
                chiffreEnCours = "";
                totalCalcul.setText(finalCalcul);
                chiffre.setText("");
            }
        });

        Button button_division = findViewById(R.id.button_division);
        button_division.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("/", finalCalcul);
                resultat = doCalcul(resultat, multiplicateur, chiffreEnCours);
                multiplicateur = Ops.DIV;
                chiffreEnCours = "";
                totalCalcul.setText(finalCalcul);
                chiffre.setText("");
            }
        });

        Button button_seven = findViewById(R.id.button_seven);
        button_seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("7", finalCalcul);
                chiffreEnCours = addElementToCalcul("7", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_height = findViewById(R.id.button_height);
        button_height.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("8", finalCalcul);
                chiffreEnCours = addElementToCalcul("8", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_nine = findViewById(R.id.button_nine);
        button_nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("9", finalCalcul);
                chiffreEnCours = addElementToCalcul("9", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_multiplication = findViewById(R.id.button_multiplication);
        button_multiplication.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("*", finalCalcul);
                resultat = doCalcul(resultat, multiplicateur, chiffreEnCours);
                multiplicateur = Ops.FOIS;
                chiffreEnCours = "";
                totalCalcul.setText(finalCalcul);
                chiffre.setText("");
            }
        });

        Button button_four = findViewById(R.id.button_four);
        button_four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("4", finalCalcul);
                chiffreEnCours = addElementToCalcul("4", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_five = findViewById(R.id.button_five);
        button_five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("5", finalCalcul);
                chiffreEnCours = addElementToCalcul("5", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_six = findViewById(R.id.button_six);
        button_six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("6", finalCalcul);
                chiffreEnCours = addElementToCalcul("6", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_plus = findViewById(R.id.button_plus);
        button_plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("+", finalCalcul);
                resultat = doCalcul(resultat, multiplicateur, chiffreEnCours);
                multiplicateur = Ops.PLUS;
                chiffreEnCours = "";
                totalCalcul.setText(finalCalcul);
                chiffre.setText("");
            }
        });

        Button button_one = findViewById(R.id.button_one);
        button_one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("1", finalCalcul);
                chiffreEnCours = addElementToCalcul("1", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_two = findViewById(R.id.button_two);
        button_two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("2", finalCalcul);
                chiffreEnCours = addElementToCalcul("2", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_three = findViewById(R.id.button_three);
        button_three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("3", finalCalcul);
                chiffreEnCours = addElementToCalcul("3", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_equal = findViewById(R.id.button_equal);
        button_equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                totalCalcul.setText(finalCalcul+"="+doCalcul(resultat, multiplicateur, chiffreEnCours));
                chiffre.setText(String.valueOf(doCalcul(resultat, multiplicateur, chiffreEnCours)));
                multiplicateur = null;
                isMultiplicateur = false;
                finalCalcul = "";
                chiffreEnCours = "";
            }

        });

        Button button_dot = findViewById(R.id.button_dot);
        button_dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul(".", finalCalcul);
                chiffreEnCours = addElementToCalcul(".", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });

        Button button_zero = findViewById(R.id.button_zero);
        button_zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView totalCalcul = findViewById(R.id.TotalCalcul);
                TextView chiffre = findViewById(R.id.Calcul);
                finalCalcul = addElementToCalcul("0", finalCalcul);
                chiffreEnCours = addElementToCalcul("0", chiffreEnCours);
                totalCalcul.setText(finalCalcul);
                chiffre.setText(chiffreEnCours);
            }
        });
    }

    public enum Ops{
        PLUS,
        MOINS,
        FOIS,
        DIV,
        PUISSANCE;
    }

    private String addElementToCalcul(String element, String calcul){
        return calcul + element;
    }
    private String removeElementToText(String text) {
        String initialCalcul = "";
        for (int i = 0; i < text.length() - 1; i++) {
            initialCalcul = initialCalcul + text.charAt(i);
        }
        return initialCalcul;
    }

    private float doCalcul(Float element1, Ops signeCalcul, String element2) {
        if (!isMultiplicateur){
            isMultiplicateur = true;
            return Float.parseFloat(element2);
        }
        else {
            switch (signeCalcul) {
                case PLUS:
                    return element1 + Float.parseFloat(element2);

                case MOINS:
                    return element1 - Float.parseFloat(element2);

                case FOIS:
                    return element1 * Float.parseFloat(element2);

                case DIV:
                    return element1 / Float.parseFloat(element2);

                case PUISSANCE:
                    float result = element1;
                    for (int i = 0; i < Float.parseFloat(element2)-1; i++) {
                        result = result * element1;
                    }
                    return result;

                default:
                    return Float.parseFloat(element2);
            }
        }
    }
}
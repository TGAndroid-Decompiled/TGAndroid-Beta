package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ys implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f52317a;
    public final SharedPreferences f52318b;
    public final int f52319c;

    public ys(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f52317a = dataSettingsActivity;
        this.f52318b = sharedPreferences;
        this.f52319c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f52317a;
        dataSettingsActivity.getClass();
        if (i7 != 0) {
            i10 = 3;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        i10 = -1;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.f52318b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.U = true;
        }
        l4 l4Var = dataSettingsActivity.f41210a;
        if (l4Var != null) {
            l4Var.g(this.f52319c);
        }
    }
}

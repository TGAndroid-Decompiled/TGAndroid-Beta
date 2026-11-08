package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ys implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f52297a;
    public final SharedPreferences f52298b;
    public final int f52299c;

    public ys(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f52297a = dataSettingsActivity;
        this.f52298b = sharedPreferences;
        this.f52299c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f52297a;
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
            this.f52298b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.U = true;
        }
        l4 l4Var = dataSettingsActivity.f41214a;
        if (l4Var != null) {
            l4Var.g(this.f52299c);
        }
    }
}

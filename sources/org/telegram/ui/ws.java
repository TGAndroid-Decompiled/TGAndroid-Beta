package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ws implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f51596a;
    public final SharedPreferences f51597b;
    public final int f51598c;

    public ws(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i3) {
        this.f51596a = dataSettingsActivity;
        this.f51597b = sharedPreferences;
        this.f51598c = i3;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f51596a;
        dataSettingsActivity.getClass();
        if (i3 != 0) {
            i10 = 3;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
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
            this.f51597b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.V = true;
        }
        n4 n4Var = dataSettingsActivity.f41243a;
        if (n4Var != null) {
            n4Var.g(this.f51598c);
        }
    }
}

package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class yt implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f43549a;
    public final SharedPreferences f43550b;
    public final int f43551c;

    public yt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f43549a = dataSettingsActivity;
        this.f43550b = sharedPreferences;
        this.f43551c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f43549a;
        dataSettingsActivity.getClass();
        if (i10 != 0) {
            i11 = 3;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = -1;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 != -1) {
            this.f43550b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        zt ztVar = dataSettingsActivity.f33124a;
        if (ztVar != null) {
            ztVar.m(this.f43551c);
        }
    }
}

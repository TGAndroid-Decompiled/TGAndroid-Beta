package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ru implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39585a;
    public final SharedPreferences f39586b;
    public final int f39587c;

    public ru(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39585a = dataSettingsActivity;
        this.f39586b = sharedPreferences;
        this.f39587c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39585a;
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
            this.f39586b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        su suVar = dataSettingsActivity.f31770a;
        if (suVar != null) {
            suVar.m(this.f39587c);
        }
    }
}

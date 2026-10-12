package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ru implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39866a;
    public final SharedPreferences f39867b;
    public final int f39868c;

    public ru(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39866a = dataSettingsActivity;
        this.f39867b = sharedPreferences;
        this.f39868c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39866a;
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
            this.f39867b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        su suVar = dataSettingsActivity.f32068a;
        if (suVar != null) {
            suVar.m(this.f39868c);
        }
    }
}

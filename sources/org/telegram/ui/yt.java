package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class yt implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f46102a;
    public final SharedPreferences f46103b;
    public final int f46104c;

    public yt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f46102a = dataSettingsActivity;
        this.f46103b = sharedPreferences;
        this.f46104c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f46102a;
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
            this.f46103b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.U = true;
        }
        zt ztVar = dataSettingsActivity.f35485a;
        if (ztVar != null) {
            ztVar.m(this.f46104c);
        }
    }
}

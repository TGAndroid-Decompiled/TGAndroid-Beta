package org.telegram.ui;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class wl implements lq0 {
    public final eo f43559a;

    public wl(eo eoVar) {
        this.f43559a = eoVar;
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f43559a.startActivityForResult(createChooser, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void a(ArrayList arrayList) {
    }
}

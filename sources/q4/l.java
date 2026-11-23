package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55853a;
    public final k f55854b;
    public final p f55855c;
    public final Bundle f55856e;
    public w f55858g;
    public List h;
    public i f55859i;
    public int f55860j;
    public int f55861k;
    public android.support.v4.media.session.s f55862l;
    public r f55863m;
    public final Object d = new Object();
    public final RemoteCallbackList f55857f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55853a = a10;
        k kVar = new k(this);
        this.f55854b = kVar;
        this.f55855c = new p(a10.getSessionToken(), kVar);
        this.f55856e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55862l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55863m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55863m = rVar;
        }
    }
}

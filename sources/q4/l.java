package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53797a;
    public final k f53798b;
    public final p f53799c;
    public final Bundle f53800e;
    public w f53802g;
    public List h;
    public i f53803i;
    public int f53804j;
    public int f53805k;
    public android.support.v4.media.session.s f53806l;
    public r f53807m;
    public final Object d = new Object();
    public final RemoteCallbackList f53801f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53797a = a10;
        k kVar = new k(this);
        this.f53798b = kVar;
        this.f53799c = new p(a10.getSessionToken(), kVar);
        this.f53800e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53806l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53807m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53807m = rVar;
        }
    }
}

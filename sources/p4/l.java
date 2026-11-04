package p4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53164a;
    public final k f53165b;
    public final p f53166c;
    public final Bundle f53167e;
    public w f53169g;
    public List h;
    public i f53170i;
    public int f53171j;
    public int f53172k;
    public android.support.v4.media.session.s f53173l;
    public r f53174m;
    public final Object d = new Object();
    public final RemoteCallbackList f53168f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53164a = a10;
        k kVar = new k(this);
        this.f53165b = kVar;
        this.f53166c = new p(a10.getSessionToken(), kVar);
        this.f53167e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53173l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53174m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53174m = rVar;
        }
    }
}

package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53785a;
    public final k f53786b;
    public final p f53787c;
    public final Bundle f53788e;
    public w f53790g;
    public List h;
    public i f53791i;
    public int f53792j;
    public int f53793k;
    public android.support.v4.media.session.s f53794l;
    public r f53795m;
    public final Object d = new Object();
    public final RemoteCallbackList f53789f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53785a = a10;
        k kVar = new k(this);
        this.f53786b = kVar;
        this.f53787c = new p(a10.getSessionToken(), kVar);
        this.f53788e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53794l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53795m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53795m = rVar;
        }
    }
}

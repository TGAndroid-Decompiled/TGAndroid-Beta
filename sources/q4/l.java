package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55931a;
    public final k f55932b;
    public final p f55933c;
    public final Bundle f55934e;
    public w f55936g;
    public List h;
    public i f55937i;
    public int f55938j;
    public int f55939k;
    public android.support.v4.media.session.s f55940l;
    public r f55941m;
    public final Object d = new Object();
    public final RemoteCallbackList f55935f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55931a = a10;
        k kVar = new k(this);
        this.f55932b = kVar;
        this.f55933c = new p(a10.getSessionToken(), kVar);
        this.f55934e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55940l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55941m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55941m = rVar;
        }
    }
}

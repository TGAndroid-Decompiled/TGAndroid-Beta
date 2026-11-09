package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53798a;
    public final k f53799b;
    public final p f53800c;
    public final Bundle f53801e;
    public w f53803g;
    public List h;
    public i f53804i;
    public int f53805j;
    public int f53806k;
    public android.support.v4.media.session.s f53807l;
    public r f53808m;
    public final Object d = new Object();
    public final RemoteCallbackList f53802f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53798a = a10;
        k kVar = new k(this);
        this.f53799b = kVar;
        this.f53800c = new p(a10.getSessionToken(), kVar);
        this.f53801e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53807l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53808m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53808m = rVar;
        }
    }
}

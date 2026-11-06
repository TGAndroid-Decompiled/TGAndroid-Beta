package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53693a;
    public final k f53694b;
    public final p f53695c;
    public final Bundle f53696e;
    public w f53698g;
    public List h;
    public i f53699i;
    public int f53700j;
    public int f53701k;
    public android.support.v4.media.session.s f53702l;
    public r f53703m;
    public final Object d = new Object();
    public final RemoteCallbackList f53697f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53693a = a10;
        k kVar = new k(this);
        this.f53694b = kVar;
        this.f53695c = new p(a10.getSessionToken(), kVar);
        this.f53696e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53702l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53703m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53703m = rVar;
        }
    }
}

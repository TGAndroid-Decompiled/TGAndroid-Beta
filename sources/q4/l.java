package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55849a;
    public final k f55850b;
    public final p f55851c;
    public final Bundle f55852e;
    public w f55854g;
    public List h;
    public i f55855i;
    public int f55856j;
    public int f55857k;
    public android.support.v4.media.session.s f55858l;
    public r f55859m;
    public final Object d = new Object();
    public final RemoteCallbackList f55853f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55849a = a10;
        k kVar = new k(this);
        this.f55850b = kVar;
        this.f55851c = new p(a10.getSessionToken(), kVar);
        this.f55852e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55858l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55859m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55859m = rVar;
        }
    }
}

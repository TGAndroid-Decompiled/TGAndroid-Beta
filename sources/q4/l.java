package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55234a;
    public final k f55235b;
    public final p f55236c;
    public final Bundle f55237e;
    public w f55239g;
    public List h;
    public i f55240i;
    public int f55241j;
    public int f55242k;
    public android.support.v4.media.session.s f55243l;
    public r f55244m;
    public final Object d = new Object();
    public final RemoteCallbackList f55238f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55234a = a10;
        k kVar = new k(this);
        this.f55235b = kVar;
        this.f55236c = new p(a10.getSessionToken(), kVar);
        this.f55237e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55243l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55244m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55244m = rVar;
        }
    }
}

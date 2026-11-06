package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53692a;
    public final k f53693b;
    public final p f53694c;
    public final Bundle f53695e;
    public w f53697g;
    public List h;
    public i f53698i;
    public int f53699j;
    public int f53700k;
    public android.support.v4.media.session.s f53701l;
    public r f53702m;
    public final Object d = new Object();
    public final RemoteCallbackList f53696f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53692a = a10;
        k kVar = new k(this);
        this.f53693b = kVar;
        this.f53694c = new p(a10.getSessionToken(), kVar);
        this.f53695e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53701l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53702m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53702m = rVar;
        }
    }
}

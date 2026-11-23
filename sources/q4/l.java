package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55818a;
    public final k f55819b;
    public final p f55820c;
    public final Bundle f55821e;
    public w f55823g;
    public List h;
    public i f55824i;
    public int f55825j;
    public int f55826k;
    public android.support.v4.media.session.s f55827l;
    public r f55828m;
    public final Object d = new Object();
    public final RemoteCallbackList f55822f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55818a = a10;
        k kVar = new k(this);
        this.f55819b = kVar;
        this.f55820c = new p(a10.getSessionToken(), kVar);
        this.f55821e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55827l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55828m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55828m = rVar;
        }
    }
}

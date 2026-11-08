package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53786a;
    public final k f53787b;
    public final p f53788c;
    public final Bundle f53789e;
    public w f53791g;
    public List h;
    public i f53792i;
    public int f53793j;
    public int f53794k;
    public android.support.v4.media.session.s f53795l;
    public r f53796m;
    public final Object d = new Object();
    public final RemoteCallbackList f53790f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53786a = a10;
        k kVar = new k(this);
        this.f53787b = kVar;
        this.f53788c = new p(a10.getSessionToken(), kVar);
        this.f53789e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53795l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53796m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53796m = rVar;
        }
    }
}

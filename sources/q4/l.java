package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f53668a;
    public final k f53669b;
    public final p f53670c;
    public final Bundle f53671e;
    public w f53673g;
    public List h;
    public i f53674i;
    public int f53675j;
    public int f53676k;
    public android.support.v4.media.session.s f53677l;
    public r f53678m;
    public final Object d = new Object();
    public final RemoteCallbackList f53672f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f53668a = a10;
        k kVar = new k(this);
        this.f53669b = kVar;
        this.f53670c = new p(a10.getSessionToken(), kVar);
        this.f53671e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f53677l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f53678m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f53678m = rVar;
        }
    }
}

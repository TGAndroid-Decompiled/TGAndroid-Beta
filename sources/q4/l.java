package q4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f55808a;
    public final k f55809b;
    public final p f55810c;
    public final Bundle f55811e;
    public w f55813g;
    public List h;
    public i f55814i;
    public int f55815j;
    public int f55816k;
    public android.support.v4.media.session.s f55817l;
    public r f55818m;
    public final Object d = new Object();
    public final RemoteCallbackList f55812f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f55808a = a10;
        k kVar = new k(this);
        this.f55809b = kVar;
        this.f55810c = new p(a10.getSessionToken(), kVar);
        this.f55811e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f55817l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f55818m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f55818m = rVar;
        }
    }
}

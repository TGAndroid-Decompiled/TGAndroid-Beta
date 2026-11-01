package vh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
public final class k0 implements vs {
    public final int f51382a;
    public final File f51383b;
    public kj f51384c;
    public final i0 d;
    public final j0 e;
    public final h0 f51385f;

    public k0(int i10, n5 n5Var, File file, i0 i0Var, j0 j0Var, h0 h0Var) {
        this.f51382a = i10;
        this.f51383b = file;
        this.d = i0Var;
        this.e = j0Var;
        this.f51385f = h0Var;
        if (this.f51384c != null) {
            return;
        }
        at.f(i10).b(this, at.a2);
        at.f(i10).b(this, at.f14682b2);
        at.f(i10).b(this, at.f14688c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19815id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f51384c = new kj(i10, tL_message, null, false, false);
        n5Var.s(new ph.h1(this, 21));
    }

    public final void a(boolean z10) {
        if (this.f51384c == null) {
            return;
        }
        int i10 = this.f51382a;
        at.f(i10).n(this, at.a2);
        at.f(i10).n(this, at.f14682b2);
        at.f(i10).n(this, at.f14688c2);
        if (z10) {
            MediaController.B().i(this.f51384c);
        }
        this.f51384c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.a2) {
            kj kjVar = (kj) objArr[0];
        } else if (i10 == at.f14682b2) {
            if (((kj) objArr[0]) == this.f51384c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                f7.getClass();
                this.e.a(f7);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i10 == at.f14688c2 && ((kj) objArr[0]) == this.f51384c) {
            a(false);
            try {
                File file = this.f51383b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f51385f.run();
        }
    }
}

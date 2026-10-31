package vh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
public final class k0 implements us {
    public final int f51367a;
    public final File f51368b;
    public jj f51369c;
    public final i0 d;
    public final j0 e;
    public final h0 f51370f;

    public k0(int i10, n5 n5Var, File file, i0 i0Var, j0 j0Var, h0 h0Var) {
        this.f51367a = i10;
        this.f51368b = file;
        this.d = i0Var;
        this.e = j0Var;
        this.f51370f = h0Var;
        if (this.f51369c != null) {
            return;
        }
        zs.f(i10).b(this, zs.a2);
        zs.f(i10).b(this, zs.f19586b2);
        zs.f(i10).b(this, zs.f19592c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19814id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f51369c = new jj(i10, tL_message, null, false, false);
        n5Var.s(new ph.h1(this, 21));
    }

    public final void a(boolean z10) {
        if (this.f51369c == null) {
            return;
        }
        int i10 = this.f51367a;
        zs.f(i10).n(this, zs.a2);
        zs.f(i10).n(this, zs.f19586b2);
        zs.f(i10).n(this, zs.f19592c2);
        if (z10) {
            MediaController.B().i(this.f51369c);
        }
        this.f51369c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.a2) {
            jj jjVar = (jj) objArr[0];
        } else if (i10 == zs.f19586b2) {
            if (((jj) objArr[0]) == this.f51369c) {
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
        } else if (i10 == zs.f19592c2 && ((jj) objArr[0]) == this.f51369c) {
            a(false);
            try {
                File file = this.f51368b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f51370f.run();
        }
    }
}

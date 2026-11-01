package vh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.is;
import org.telegram.ui.zj0;
public final class t0 {
    public final int f51962a;
    public final ArrayList f51963b = new ArrayList();
    public boolean f51964c;
    public boolean d;
    public boolean e;
    public boolean f51965f;
    public File f51966g;

    public t0(int i10) {
        this.f51962a = i10;
        if (!this.e && !this.f51965f) {
            this.f51965f = true;
            p0 p0Var = new p0(this, 0);
            is a02 = is.a0(i10);
            a02.f16331a.c(new zj0((Object) a02, true, (Object) p0Var, 17));
        }
    }

    public final void a(s0 s0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i10 = this.f51962a;
        is a02 = is.a0(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(s0Var.f51886a);
        sb3.append(" (edit=");
        sb3.append(s0Var.G);
        if (s0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(s0Var.H);
            sb4.append(", ");
            if (s0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = s0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = s0Var.K;
            }
            sb2.append(j10);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(s0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.f8.b(sb3.toString());
        a02.f16331a.c(new q0(a02, s0Var, 1));
        at.f(i10).k(at.f14825y5, new Object[0]);
    }

    public final void b(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n5 n5Var = (n5) arrayList.get(i10);
                if (n5Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(n5Var.f51532b);
                    sb3.append(" (edit=");
                    sb3.append(n5Var.f51544g);
                    if (n5Var.f51544g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(n5Var.f51542f);
                        sb4.append(", ");
                        if (n5Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j10 = n5Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j10 = n5Var.I;
                        }
                        sb2.append(j10);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(n5Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    org.telegram.messenger.f8.b(sb3.toString());
                    arrayList2.add(Long.valueOf(n5Var.f51532b));
                    n5Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f51963b.removeAll(arrayList);
            int i11 = this.f51962a;
            is a02 = is.a0(i11);
            a02.f16331a.c(new ag.r0(a02, arrayList2, 2));
            at.f(i11).k(at.f14825y5, new Object[0]);
        }
    }

    public final void c(n5 n5Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(n5Var);
        b(arrayList);
    }

    public final void d(n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        e(n5Var);
        ArrayList arrayList = this.f51963b;
        arrayList.remove(n5Var);
        if (!n5Var.f51573w) {
            arrayList.add(0, n5Var);
        }
        s0 s0Var = new s0(n5Var);
        int i10 = this.f51962a;
        is a02 = is.a0(i10);
        a02.f16331a.c(new q0(a02, s0Var, 0));
        at.f(i10).k(at.f14825y5, new Object[0]);
    }

    public final void e(n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        if (n5Var.f51532b == 0) {
            n5Var.f51532b = Utilities.f14520b.nextLong();
        }
        n5Var.d = System.currentTimeMillis();
        n5Var.f51535c = true;
        if (n5Var.M) {
            n5Var.L = f(n5Var.L);
        } else if (n5Var.L != null) {
            File x10 = n5.x(this.f51962a, n5Var.K);
            try {
                org.telegram.messenger.i0.E(n5Var.L, x10);
                n5Var.L = f(x10);
                n5Var.M = true;
            } catch (IOException e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        n5Var.Z0 = f(n5Var.Z0);
        n5Var.P0 = f(n5Var.P0);
        n5Var.O0 = f(n5Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f51966g == null) {
            File file2 = new File(org.telegram.messenger.b8.z(4), "drafts");
            this.f51966g = file2;
            if (!file2.exists()) {
                this.f51966g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f51966g.getAbsolutePath())) {
            File file3 = new File(this.f51966g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

package vh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.zs;
import org.telegram.ui.bk0;
public final class s0 {
    public final int f51901a;
    public final ArrayList f51902b = new ArrayList();
    public boolean f51903c;
    public boolean d;
    public boolean e;
    public boolean f51904f;
    public File f51905g;

    public s0(int i10) {
        this.f51901a = i10;
        if (!this.e && !this.f51904f) {
            this.f51904f = true;
            p0 p0Var = new p0(this, 0);
            hs a02 = hs.a0(i10);
            a02.f15938a.c(new bk0((Object) a02, true, (Object) p0Var, 17));
        }
    }

    public final void a(r0 r0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i10 = this.f51901a;
        hs a02 = hs.a0(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(r0Var.f51799a);
        sb3.append(" (edit=");
        sb3.append(r0Var.G);
        if (r0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(r0Var.H);
            sb4.append(", ");
            if (r0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = r0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = r0Var.K;
            }
            sb2.append(j10);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(r0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.f8.b(sb3.toString());
        a02.f15938a.c(new q0(a02, r0Var, 1));
        zs.f(i10).k(zs.f19729y5, new Object[0]);
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
                    sb3.append(n5Var.f51517b);
                    sb3.append(" (edit=");
                    sb3.append(n5Var.f51529g);
                    if (n5Var.f51529g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(n5Var.f51527f);
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
                    arrayList2.add(Long.valueOf(n5Var.f51517b));
                    n5Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f51902b.removeAll(arrayList);
            int i11 = this.f51901a;
            hs a02 = hs.a0(i11);
            a02.f15938a.c(new ag.r0(a02, arrayList2, 2));
            zs.f(i11).k(zs.f19729y5, new Object[0]);
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
        ArrayList arrayList = this.f51902b;
        arrayList.remove(n5Var);
        if (!n5Var.f51558w) {
            arrayList.add(0, n5Var);
        }
        r0 r0Var = new r0(n5Var);
        int i10 = this.f51901a;
        hs a02 = hs.a0(i10);
        a02.f15938a.c(new q0(a02, r0Var, 0));
        zs.f(i10).k(zs.f19729y5, new Object[0]);
    }

    public final void e(n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        if (n5Var.f51517b == 0) {
            n5Var.f51517b = Utilities.f14519b.nextLong();
        }
        n5Var.d = System.currentTimeMillis();
        n5Var.f51520c = true;
        if (n5Var.M) {
            n5Var.L = f(n5Var.L);
        } else if (n5Var.L != null) {
            File x10 = n5.x(this.f51901a, n5Var.K);
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
        if (this.f51905g == null) {
            File file2 = new File(org.telegram.messenger.b8.z(4), "drafts");
            this.f51905g = file2;
            if (!file2.exists()) {
                this.f51905g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f51905g.getAbsolutePath())) {
            File file3 = new File(this.f51905g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

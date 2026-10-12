package qi;

import java.io.File;
import java.io.IOException;
public final class a0 implements Runnable {
    public final int f46666a;
    public final p0 f46667b;
    public final File f46668c;

    public a0(p0 p0Var, File file, int i10) {
        this.f46666a = i10;
        this.f46667b = p0Var;
        this.f46668c = file;
    }

    @Override
    public final void run() {
        int i10;
        String name;
        switch (this.f46666a) {
            case 0:
                p0 p0Var = this.f46667b;
                File file = this.f46668c;
                synchronized (p0Var.h) {
                    i10 = 0;
                    for (int i11 = 0; i11 < p0Var.h.size(); i11++) {
                        try {
                            File file2 = (File) p0Var.h.get(i11);
                            if (file != null && file.equals(file2)) {
                            }
                            p0Var.h(file2);
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    p0Var.h.clear();
                }
                l lVar = p0Var.f46863n;
                StringBuilder l4 = hg.c.l(i10, "temporary file cleanup completed: deleted=", ", retained=");
                if (file == null) {
                    name = "none";
                } else {
                    name = file.getName();
                }
                l4.append(name);
                lVar.b(l4.toString());
                return;
            case 1:
                this.f46667b.i(this.f46668c);
                return;
            default:
                p0 p0Var2 = this.f46667b;
                File file3 = this.f46668c;
                s sVar = p0Var2.R;
                if (sVar != null) {
                    try {
                        sVar.a();
                    } catch (IOException e7) {
                        p0Var2.f46863n.a("MP4 abort failed", e7);
                    }
                }
                p0Var2.f46861l.execute(new a0(p0Var2, file3, 0));
                p0Var2.f46860k.shutdown();
                p0Var2.f46861l.shutdown();
                return;
        }
    }
}

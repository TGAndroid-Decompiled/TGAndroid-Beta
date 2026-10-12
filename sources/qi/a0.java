package qi;

import java.io.File;
import java.io.IOException;
public final class a0 implements Runnable {
    public final int f46674a;
    public final p0 f46675b;
    public final File f46676c;

    public a0(p0 p0Var, File file, int i10) {
        this.f46674a = i10;
        this.f46675b = p0Var;
        this.f46676c = file;
    }

    @Override
    public final void run() {
        int i10;
        String name;
        switch (this.f46674a) {
            case 0:
                p0 p0Var = this.f46675b;
                File file = this.f46676c;
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
                l lVar = p0Var.f46871n;
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
                this.f46675b.i(this.f46676c);
                return;
            default:
                p0 p0Var2 = this.f46675b;
                File file3 = this.f46676c;
                s sVar = p0Var2.R;
                if (sVar != null) {
                    try {
                        sVar.a();
                    } catch (IOException e7) {
                        p0Var2.f46871n.a("MP4 abort failed", e7);
                    }
                }
                p0Var2.f46869l.execute(new a0(p0Var2, file3, 0));
                p0Var2.f46868k.shutdown();
                p0Var2.f46869l.shutdown();
                return;
        }
    }
}

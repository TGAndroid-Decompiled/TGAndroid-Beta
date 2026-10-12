package pi;

import java.io.File;
import java.util.concurrent.ExecutorService;
public final class c implements Runnable {
    public final int f45774a;
    public final t f45775b;
    public final File f45776c;

    public c(t tVar, File file, int i10) {
        this.f45774a = i10;
        this.f45775b = tVar;
        this.f45776c = file;
    }

    @Override
    public final void run() {
        int i10;
        String name;
        switch (this.f45774a) {
            case 0:
                t tVar = this.f45775b;
                File file = this.f45776c;
                ExecutorService executorService = tVar.f45827j;
                executorService.execute(new c(tVar, file, 1));
                tVar.f45826i.shutdown();
                executorService.shutdown();
                return;
            default:
                t tVar2 = this.f45775b;
                File file2 = this.f45776c;
                synchronized (tVar2.f45829l) {
                    i10 = 0;
                    for (int i11 = 0; i11 < tVar2.f45829l.size(); i11++) {
                        try {
                            File file3 = (File) tVar2.f45829l.get(i11);
                            if (file2 != null && file2.equals(file3)) {
                            }
                            tVar2.h(file3);
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    tVar2.f45829l.clear();
                }
                b bVar = tVar2.f45825g;
                StringBuilder l4 = hg.c.l(i10, "temporary file cleanup completed: deleted=", ", retained=");
                if (file2 == null) {
                    name = "none";
                } else {
                    name = file2.getName();
                }
                l4.append(name);
                bVar.b(l4.toString());
                return;
        }
    }
}

package pi;

import java.io.File;
import java.util.concurrent.ExecutorService;
public final class c implements Runnable {
    public final int f45769a;
    public final s f45770b;
    public final File f45771c;

    public c(s sVar, File file, int i10) {
        this.f45769a = i10;
        this.f45770b = sVar;
        this.f45771c = file;
    }

    @Override
    public final void run() {
        int i10;
        String name;
        switch (this.f45769a) {
            case 0:
                s sVar = this.f45770b;
                File file = this.f45771c;
                ExecutorService executorService = sVar.f45819j;
                executorService.execute(new c(sVar, file, 1));
                sVar.f45818i.shutdown();
                executorService.shutdown();
                return;
            default:
                s sVar2 = this.f45770b;
                File file2 = this.f45771c;
                synchronized (sVar2.f45821l) {
                    i10 = 0;
                    for (int i11 = 0; i11 < sVar2.f45821l.size(); i11++) {
                        try {
                            File file3 = (File) sVar2.f45821l.get(i11);
                            if (file2 != null && file2.equals(file3)) {
                            }
                            sVar2.f(file3);
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    sVar2.f45821l.clear();
                }
                b bVar = sVar2.f45817g;
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

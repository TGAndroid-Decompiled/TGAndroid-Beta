package ph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cr0;
public final class t0 {
    public final int f42383a;
    public final ArrayList f42384b = new ArrayList();
    public boolean f42385c;
    public boolean d;
    public boolean e;
    public boolean f42386f;
    public File f42387g;

    public t0(int i10) {
        this.f42383a = i10;
        if (!this.e && !this.f42386f) {
            this.f42386f = true;
            q0 q0Var = new q0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new cr0((Object) messagesStorage, true, (Object) q0Var, 8));
        }
    }

    public final void a(s0 s0Var) {
        String str;
        StringBuilder sb;
        long j10;
        int i10 = this.f42383a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(s0Var.f42298a);
        sb2.append(" (edit=");
        sb2.append(s0Var.G);
        if (s0Var.G) {
            StringBuilder sb3 = new StringBuilder(", storyId=");
            sb3.append(s0Var.H);
            sb3.append(", ");
            if (s0Var.J != 0) {
                sb = new StringBuilder("documentId=");
                j10 = s0Var.J;
            } else {
                sb = new StringBuilder("photoId=");
                j10 = s0Var.K;
            }
            sb.append(j10);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(s0Var.L);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        FileLog.d(sb2.toString());
        messagesStorage.getStorageQueue().postRunnable(new r0(messagesStorage, s0Var, 1));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(ArrayList arrayList) {
        String str;
        StringBuilder sb;
        long j10;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                t6 t6Var = (t6) arrayList.get(i10);
                if (t6Var != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(t6Var.f42402b);
                    sb2.append(" (edit=");
                    sb2.append(t6Var.f42414g);
                    if (t6Var.f42414g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(t6Var.f42412f);
                        sb3.append(", ");
                        if (t6Var.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j10 = t6Var.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j10 = t6Var.I;
                        }
                        sb.append(j10);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(t6Var.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    FileLog.d(sb2.toString());
                    arrayList2.add(Long.valueOf(t6Var.f42402b));
                    t6Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f42384b.removeAll(arrayList);
            int i11 = this.f42383a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new p0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(t6 t6Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t6Var);
        b(arrayList);
    }

    public final void d(t6 t6Var) {
        if (t6Var == null) {
            return;
        }
        e(t6Var);
        ArrayList arrayList = this.f42384b;
        arrayList.remove(t6Var);
        if (!t6Var.f42443w) {
            arrayList.add(0, t6Var);
        }
        s0 s0Var = new s0(t6Var);
        int i10 = this.f42383a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new r0(messagesStorage, s0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(t6 t6Var) {
        if (t6Var == null) {
            return;
        }
        if (t6Var.f42402b == 0) {
            t6Var.f42402b = Utilities.random.nextLong();
        }
        t6Var.d = System.currentTimeMillis();
        t6Var.f42405c = true;
        if (t6Var.M) {
            t6Var.L = f(t6Var.L);
        } else if (t6Var.L != null) {
            File x10 = t6.x(this.f42383a, t6Var.K);
            try {
                AndroidUtilities.copyFile(t6Var.L, x10);
                t6Var.L = f(x10);
                t6Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        t6Var.Z0 = f(t6Var.Z0);
        t6Var.P0 = f(t6Var.P0);
        t6Var.O0 = f(t6Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f42387g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f42387g = file2;
            if (!file2.exists()) {
                this.f42387g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f42387g.getAbsolutePath())) {
            File file3 = new File(this.f42387g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

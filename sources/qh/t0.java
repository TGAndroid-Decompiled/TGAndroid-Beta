package qh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xq0;
public final class t0 {
    public final int f46102a;
    public final ArrayList f46103b = new ArrayList();
    public boolean f46104c;
    public boolean d;
    public boolean f46105e;
    public boolean f46106f;
    public File f46107g;

    public t0(int i10) {
        this.f46102a = i10;
        if (!this.f46105e && !this.f46106f) {
            this.f46106f = true;
            q0 q0Var = new q0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new xq0((Object) messagesStorage, true, (Object) q0Var, 8));
        }
    }

    public final void a(s0 s0Var) {
        String str;
        StringBuilder sb;
        long j10;
        int i10 = this.f46102a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(s0Var.f45993a);
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
                s6 s6Var = (s6) arrayList.get(i10);
                if (s6Var != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(s6Var.f46044b);
                    sb2.append(" (edit=");
                    sb2.append(s6Var.f46057g);
                    if (s6Var.f46057g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(s6Var.f46055f);
                        sb3.append(", ");
                        if (s6Var.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j10 = s6Var.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j10 = s6Var.I;
                        }
                        sb.append(j10);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(s6Var.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    FileLog.d(sb2.toString());
                    arrayList2.add(Long.valueOf(s6Var.f46044b));
                    s6Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f46103b.removeAll(arrayList);
            int i11 = this.f46102a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new p0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(s6 s6Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(s6Var);
        b(arrayList);
    }

    public final void d(s6 s6Var) {
        if (s6Var == null) {
            return;
        }
        e(s6Var);
        ArrayList arrayList = this.f46103b;
        arrayList.remove(s6Var);
        if (!s6Var.f46086w) {
            arrayList.add(0, s6Var);
        }
        s0 s0Var = new s0(s6Var);
        int i10 = this.f46102a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new r0(messagesStorage, s0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(s6 s6Var) {
        if (s6Var == null) {
            return;
        }
        if (s6Var.f46044b == 0) {
            s6Var.f46044b = Utilities.random.nextLong();
        }
        s6Var.d = System.currentTimeMillis();
        s6Var.f46047c = true;
        if (s6Var.M) {
            s6Var.L = f(s6Var.L);
        } else if (s6Var.L != null) {
            File x10 = s6.x(this.f46102a, s6Var.K);
            try {
                AndroidUtilities.copyFile(s6Var.L, x10);
                s6Var.L = f(x10);
                s6Var.M = true;
            } catch (IOException e6) {
                FileLog.e(e6);
            }
        }
        s6Var.Z0 = f(s6Var.Z0);
        s6Var.P0 = f(s6Var.P0);
        s6Var.O0 = f(s6Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f46107g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f46107g = file2;
            if (!file2.exists()) {
                this.f46107g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f46107g.getAbsolutePath())) {
            File file3 = new File(this.f46107g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

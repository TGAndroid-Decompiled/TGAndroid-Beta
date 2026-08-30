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
import org.telegram.ui.vq0;
public final class t0 {
    public final int f42318a;
    public final ArrayList f42319b = new ArrayList();
    public boolean f42320c;
    public boolean d;
    public boolean e;
    public boolean f42321f;
    public File f42322g;

    public t0(int i10) {
        this.f42318a = i10;
        if (!this.e && !this.f42321f) {
            this.f42321f = true;
            q0 q0Var = new q0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new vq0((Object) messagesStorage, true, (Object) q0Var, 8));
        }
    }

    public final void a(s0 s0Var) {
        String str;
        StringBuilder sb;
        long j10;
        int i10 = this.f42318a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(s0Var.f42263a);
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
                u6 u6Var = (u6) arrayList.get(i10);
                if (u6Var != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(u6Var.f42401b);
                    sb2.append(" (edit=");
                    sb2.append(u6Var.f42413g);
                    if (u6Var.f42413g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(u6Var.f42411f);
                        sb3.append(", ");
                        if (u6Var.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j10 = u6Var.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j10 = u6Var.I;
                        }
                        sb.append(j10);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(u6Var.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    FileLog.d(sb2.toString());
                    arrayList2.add(Long.valueOf(u6Var.f42401b));
                    u6Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f42319b.removeAll(arrayList);
            int i11 = this.f42318a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new p0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(u6 u6Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(u6Var);
        b(arrayList);
    }

    public final void d(u6 u6Var) {
        if (u6Var == null) {
            return;
        }
        e(u6Var);
        ArrayList arrayList = this.f42319b;
        arrayList.remove(u6Var);
        if (!u6Var.f42442w) {
            arrayList.add(0, u6Var);
        }
        s0 s0Var = new s0(u6Var);
        int i10 = this.f42318a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new r0(messagesStorage, s0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(u6 u6Var) {
        if (u6Var == null) {
            return;
        }
        if (u6Var.f42401b == 0) {
            u6Var.f42401b = Utilities.random.nextLong();
        }
        u6Var.d = System.currentTimeMillis();
        u6Var.f42404c = true;
        if (u6Var.M) {
            u6Var.L = f(u6Var.L);
        } else if (u6Var.L != null) {
            File x10 = u6.x(this.f42318a, u6Var.K);
            try {
                AndroidUtilities.copyFile(u6Var.L, x10);
                u6Var.L = f(x10);
                u6Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        u6Var.Z0 = f(u6Var.Z0);
        u6Var.P0 = f(u6Var.P0);
        u6Var.O0 = f(u6Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f42322g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f42322g = file2;
            if (!file2.exists()) {
                this.f42322g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f42322g.getAbsolutePath())) {
            File file3 = new File(this.f42322g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

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
import org.telegram.ui.cr0;
public final class t0 {
    public final int f46115a;
    public final ArrayList f46116b = new ArrayList();
    public boolean f46117c;
    public boolean d;
    public boolean f46118e;
    public boolean f46119f;
    public File f46120g;

    public t0(int i10) {
        this.f46115a = i10;
        if (!this.f46118e && !this.f46119f) {
            this.f46119f = true;
            q0 q0Var = new q0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new cr0((Object) messagesStorage, true, (Object) q0Var, 8));
        }
    }

    public final void a(s0 s0Var) {
        String str;
        StringBuilder sb;
        long j10;
        int i10 = this.f46115a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(s0Var.f46054a);
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
                r6 r6Var = (r6) arrayList.get(i10);
                if (r6Var != null) {
                    StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                    sb2.append(r6Var.f45995b);
                    sb2.append(" (edit=");
                    sb2.append(r6Var.f46008g);
                    if (r6Var.f46008g) {
                        StringBuilder sb3 = new StringBuilder(", storyId=");
                        sb3.append(r6Var.f46006f);
                        sb3.append(", ");
                        if (r6Var.H != 0) {
                            sb = new StringBuilder("documentId=");
                            j10 = r6Var.H;
                        } else {
                            sb = new StringBuilder("photoId=");
                            j10 = r6Var.I;
                        }
                        sb.append(j10);
                        sb3.append(sb.toString());
                        sb3.append(", expireDate=");
                        sb3.append(r6Var.J);
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(", now=");
                    sb2.append(System.currentTimeMillis());
                    sb2.append(")");
                    FileLog.d(sb2.toString());
                    arrayList2.add(Long.valueOf(r6Var.f45995b));
                    r6Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f46116b.removeAll(arrayList);
            int i11 = this.f46115a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new p0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(r6 r6Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r6Var);
        b(arrayList);
    }

    public final void d(r6 r6Var) {
        if (r6Var == null) {
            return;
        }
        e(r6Var);
        ArrayList arrayList = this.f46116b;
        arrayList.remove(r6Var);
        if (!r6Var.f46037w) {
            arrayList.add(0, r6Var);
        }
        s0 s0Var = new s0(r6Var);
        int i10 = this.f46115a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new r0(messagesStorage, s0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(r6 r6Var) {
        if (r6Var == null) {
            return;
        }
        if (r6Var.f45995b == 0) {
            r6Var.f45995b = Utilities.random.nextLong();
        }
        r6Var.d = System.currentTimeMillis();
        r6Var.f45998c = true;
        if (r6Var.M) {
            r6Var.L = f(r6Var.L);
        } else if (r6Var.L != null) {
            File x10 = r6.x(this.f46115a, r6Var.K);
            try {
                AndroidUtilities.copyFile(r6Var.L, x10);
                r6Var.L = f(x10);
                r6Var.M = true;
            } catch (IOException e6) {
                FileLog.e(e6);
            }
        }
        r6Var.Z0 = f(r6Var.Z0);
        r6Var.P0 = f(r6Var.P0);
        r6Var.O0 = f(r6Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f46120g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f46120g = file2;
            if (!file2.exists()) {
                this.f46120g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f46120g.getAbsolutePath())) {
            File file3 = new File(this.f46120g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}

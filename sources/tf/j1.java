package tf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zp0;
import ph.e6;
public class j1 {
    public i1 f44819a;
    public ArrayList f44826k;
    public ArrayList f44827l;
    public String f44829n;
    public final boolean f44830o;
    public ArrayList f44832q;
    public HashMap f44833r;
    public final ArrayList f44820b = new ArrayList();
    public String f44821c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f44822f = new a0.h();
    public final ArrayList f44823g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f44824i = new a0.h();
    public final ArrayList f44825j = new ArrayList();
    public final int f44828m = UserConfig.selectedAccount;
    public boolean f44831p = true;
    public boolean f44834s = false;

    public j1(boolean z4) {
        this.f44830o = z4;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z4 = false;
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                    start++;
                }
                String charSequence2 = charSequence.subSequence(start, end).toString();
                if (this.f44833r == null) {
                    this.f44833r = new HashMap();
                    this.f44832q = new ArrayList();
                }
                h1 h1Var = (h1) this.f44833r.get(charSequence2);
                if (h1Var == 0) {
                    h1Var = new Object();
                    h1Var.f44805a = charSequence2;
                    this.f44833r.put(charSequence2, h1Var);
                } else {
                    this.f44832q.remove((Object) h1Var);
                }
                h1Var.f44806b = (int) (System.currentTimeMillis() / 1000);
                this.f44832q.add(0, h1Var);
                z4 = true;
            }
            if (z4) {
                MessagesStorage.getInstance(this.f44828m).getStorageQueue().postRunnable(new e6(27, this, this.f44832q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f44822f.b();
        this.d.clear();
    }

    public final void c() {
        this.f44832q = new ArrayList();
        this.f44833r = new HashMap();
        MessagesStorage.getInstance(this.f44828m).getStorageQueue().postRunnable(new g1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f44820b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f44826k = arrayList;
        this.f44827l = arrayList2;
        a0.h hVar = this.f44822f;
        if (hVar.m() != 0) {
            if (arrayList != null || arrayList2 != null) {
                if (arrayList == null) {
                    size = 0;
                } else {
                    size = arrayList.size();
                }
                if (arrayList2 == null) {
                    size2 = 0;
                } else {
                    size2 = arrayList2.size();
                }
                int i10 = size2 + size;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 < size) {
                        obj = arrayList.get(i11);
                    } else {
                        obj = arrayList2.get(i11 - size);
                    }
                    if (obj instanceof y) {
                        obj = ((y) obj).f44942a;
                    }
                    if (obj instanceof zp0) {
                        obj = ((zp0) obj).f31454b;
                    }
                    boolean z4 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z4) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f19306id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f19306id);
                        }
                        long j10 = user.f19306id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f44823g.remove(tLObject);
                            hVar2.l(user.f19306id);
                        }
                        long j11 = user.f19306id;
                        a0.h hVar3 = this.f44824i;
                        Object f10 = hVar3.f(j11);
                        if (f10 != null) {
                            this.f44825j.remove(f10);
                            hVar3.l(user.f19306id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f19159id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f19159id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z4, boolean z10, boolean z11, boolean z12, long j10, boolean z13, int i10, int i11) {
        h(str, z4, z10, z11, z12, false, j10, z13, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.kh r35) {
        throw new UnsupportedOperationException("Method not decompiled: tf.j1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.kh):void");
    }

    public final void i() {
        a0.h hVar = this.f44822f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m9 = hVar2.m();
            for (int i10 = 0; i10 < m9; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f19306id);
                }
            }
        }
    }
}

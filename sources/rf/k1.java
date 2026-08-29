package rf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qp0;
public class k1 {
    public j1 f47277a;
    public ArrayList f47285k;
    public ArrayList f47286l;
    public String f47288n;
    public final boolean f47289o;
    public ArrayList f47291q;
    public HashMap f47292r;
    public final ArrayList f47278b = new ArrayList();
    public String f47279c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f47280e = new ArrayList();
    public final a0.h f47281f = new a0.h();
    public final ArrayList f47282g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f47283i = new a0.h();
    public final ArrayList f47284j = new ArrayList();
    public final int f47287m = UserConfig.selectedAccount;
    public boolean f47290p = true;
    public boolean f47293s = false;

    public k1(boolean z10) {
        this.f47289o = z10;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z10 = false;
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                    start++;
                }
                String charSequence2 = charSequence.subSequence(start, end).toString();
                if (this.f47292r == null) {
                    this.f47292r = new HashMap();
                    this.f47291q = new ArrayList();
                }
                i1 i1Var = (i1) this.f47292r.get(charSequence2);
                if (i1Var == 0) {
                    i1Var = new Object();
                    i1Var.f47262a = charSequence2;
                    this.f47292r.put(charSequence2, i1Var);
                } else {
                    this.f47291q.remove((Object) i1Var);
                }
                i1Var.f47263b = (int) (System.currentTimeMillis() / 1000);
                this.f47291q.add(0, i1Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f47287m).getStorageQueue().postRunnable(new org.telegram.ui.web.y(25, this, this.f47291q));
            }
        }
    }

    public final void b() {
        this.f47280e.clear();
        this.f47281f.b();
        this.d.clear();
    }

    public final void c() {
        this.f47291q = new ArrayList();
        this.f47292r = new HashMap();
        MessagesStorage.getInstance(this.f47287m).getStorageQueue().postRunnable(new h1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f47278b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f47285k = arrayList;
        this.f47286l = arrayList2;
        a0.h hVar = this.f47281f;
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
                    if (obj instanceof z) {
                        obj = ((z) obj).f47408a;
                    }
                    if (obj instanceof qp0) {
                        obj = ((qp0) obj).f32027b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f47280e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f22539id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f22539id);
                        }
                        long j10 = user.f22539id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f47282g.remove(tLObject);
                            hVar2.l(user.f22539id);
                        }
                        long j11 = user.f22539id;
                        a0.h hVar3 = this.f47283i;
                        Object f9 = hVar3.f(j11);
                        if (f9 != null) {
                            this.f47284j.remove(f9);
                            hVar3.l(user.f22539id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f22392id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f22392id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.gg r35) {
        throw new UnsupportedOperationException("Method not decompiled: rf.k1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.gg):void");
    }

    public final void i() {
        a0.h hVar = this.f47281f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.f47280e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f22539id);
                }
            }
        }
    }
}

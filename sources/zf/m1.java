package zf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.e20;
import org.telegram.messenger.is;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep0;
import xh.e3;
public class m1 {
    public l1 f55593a;
    public ArrayList f55600k;
    public ArrayList f55601l;
    public String f55603n;
    public final boolean f55604o;
    public ArrayList f55606q;
    public HashMap f55607r;
    public final ArrayList f55594b = new ArrayList();
    public String f55595c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f55596f = new a0.h();
    public final ArrayList f55597g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f55598i = new a0.h();
    public final ArrayList f55599j = new ArrayList();
    public final int f55602m = e20.f15506s0;
    public boolean f55605p = true;
    public boolean f55608s = false;

    public m1(boolean z10) {
        this.f55604o = z10;
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
                if (this.f55607r == null) {
                    this.f55607r = new HashMap();
                    this.f55606q = new ArrayList();
                }
                k1 k1Var = (k1) this.f55607r.get(charSequence2);
                if (k1Var == 0) {
                    k1Var = new Object();
                    k1Var.f55574a = charSequence2;
                    this.f55607r.put(charSequence2, k1Var);
                } else {
                    this.f55606q.remove((Object) k1Var);
                }
                k1Var.f55575b = (int) (System.currentTimeMillis() / 1000);
                this.f55606q.add(0, k1Var);
                z10 = true;
            }
            if (z10) {
                is.a0(this.f55602m).f16331a.c(new e3(8, this, this.f55606q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f55596f.b();
        this.d.clear();
    }

    public final void c() {
        this.f55606q = new ArrayList();
        this.f55607r = new HashMap();
        is.a0(this.f55602m).f16331a.c(new j1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f55594b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f55600k = arrayList;
        this.f55601l = arrayList2;
        a0.h hVar = this.f55596f;
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
                        obj = ((y) obj).f55696a;
                    }
                    if (obj instanceof ep0) {
                        obj = ((ep0) obj).f25899b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f19943id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f19943id);
                        }
                        long j10 = user.f19943id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f55597g.remove(tLObject);
                            hVar2.l(user.f19943id);
                        }
                        long j11 = user.f19943id;
                        a0.h hVar3 = this.f55598i;
                        Object f7 = hVar3.f(j11);
                        if (f7 != null) {
                            this.f55599j.remove(f7);
                            hVar3.l(user.f19943id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f19794id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f19794id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: zf.m1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f55596f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f19943id);
                }
            }
        }
    }
}

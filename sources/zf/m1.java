package zf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp0;
public class m1 {
    public l1 f55575a;
    public ArrayList f55582k;
    public ArrayList f55583l;
    public String f55585n;
    public final boolean f55586o;
    public ArrayList f55588q;
    public HashMap f55589r;
    public final ArrayList f55576b = new ArrayList();
    public String f55577c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f55578f = new a0.h();
    public final ArrayList f55579g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f55580i = new a0.h();
    public final ArrayList f55581j = new ArrayList();
    public final int f55584m = d20.f15147s0;
    public boolean f55587p = true;
    public boolean f55590s = false;

    public m1(boolean z10) {
        this.f55586o = z10;
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
                if (this.f55589r == null) {
                    this.f55589r = new HashMap();
                    this.f55588q = new ArrayList();
                }
                k1 k1Var = (k1) this.f55589r.get(charSequence2);
                if (k1Var == 0) {
                    k1Var = new Object();
                    k1Var.f55556a = charSequence2;
                    this.f55589r.put(charSequence2, k1Var);
                } else {
                    this.f55588q.remove((Object) k1Var);
                }
                k1Var.f55557b = (int) (System.currentTimeMillis() / 1000);
                this.f55588q.add(0, k1Var);
                z10 = true;
            }
            if (z10) {
                hs.a0(this.f55584m).f15938a.c(new yh.o(7, this, this.f55588q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f55578f.b();
        this.d.clear();
    }

    public final void c() {
        this.f55588q = new ArrayList();
        this.f55589r = new HashMap();
        hs.a0(this.f55584m).f15938a.c(new j1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f55576b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f55582k = arrayList;
        this.f55583l = arrayList2;
        a0.h hVar = this.f55578f;
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
                        obj = ((y) obj).f55678a;
                    }
                    if (obj instanceof dp0) {
                        obj = ((dp0) obj).f25501b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f19942id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f19942id);
                        }
                        long j10 = user.f19942id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f55579g.remove(tLObject);
                            hVar2.l(user.f19942id);
                        }
                        long j11 = user.f19942id;
                        a0.h hVar3 = this.f55580i;
                        Object f7 = hVar3.f(j11);
                        if (f7 != null) {
                            this.f55581j.remove(f7);
                            hVar3.l(user.f19942id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f19793id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f19793id);
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
        a0.h hVar = this.f55578f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f19942id);
                }
            }
        }
    }
}

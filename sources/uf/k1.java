package uf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq0;
import qh.d6;
public class k1 {
    public j1 f48618a;
    public ArrayList f48626k;
    public ArrayList f48627l;
    public String f48629n;
    public final boolean f48630o;
    public ArrayList f48632q;
    public HashMap f48633r;
    public final ArrayList f48619b = new ArrayList();
    public String f48620c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f48621e = new ArrayList();
    public final a0.h f48622f = new a0.h();
    public final ArrayList f48623g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f48624i = new a0.h();
    public final ArrayList f48625j = new ArrayList();
    public final int f48628m = UserConfig.selectedAccount;
    public boolean f48631p = true;
    public boolean f48634s = false;

    public k1(boolean z4) {
        this.f48630o = z4;
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
                if (this.f48633r == null) {
                    this.f48633r = new HashMap();
                    this.f48632q = new ArrayList();
                }
                i1 i1Var = (i1) this.f48633r.get(charSequence2);
                if (i1Var == 0) {
                    i1Var = new Object();
                    i1Var.f48603a = charSequence2;
                    this.f48633r.put(charSequence2, i1Var);
                } else {
                    this.f48632q.remove((Object) i1Var);
                }
                i1Var.f48604b = (int) (System.currentTimeMillis() / 1000);
                this.f48632q.add(0, i1Var);
                z4 = true;
            }
            if (z4) {
                MessagesStorage.getInstance(this.f48628m).getStorageQueue().postRunnable(new d6(28, this, this.f48632q));
            }
        }
    }

    public final void b() {
        this.f48621e.clear();
        this.f48622f.b();
        this.d.clear();
    }

    public final void c() {
        this.f48632q = new ArrayList();
        this.f48633r = new HashMap();
        MessagesStorage.getInstance(this.f48628m).getStorageQueue().postRunnable(new g1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f48619b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f48626k = arrayList;
        this.f48627l = arrayList2;
        a0.h hVar = this.f48622f;
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
                        obj = ((y) obj).f48739a;
                    }
                    if (obj instanceof aq0) {
                        obj = ((aq0) obj).f25320b;
                    }
                    boolean z4 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f48621e;
                    if (z4) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f20990id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f20990id);
                        }
                        long j10 = user.f20990id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f48623g.remove(tLObject);
                            hVar2.l(user.f20990id);
                        }
                        long j11 = user.f20990id;
                        a0.h hVar3 = this.f48624i;
                        Object f10 = hVar3.f(j11);
                        if (f10 != null) {
                            this.f48625j.remove(f10);
                            hVar3.l(user.f20990id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f20843id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f20843id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z4, boolean z10, boolean z11, boolean z12, long j10, boolean z13, int i10, int i11) {
        h(str, z4, z10, z11, z12, false, j10, z13, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.ih r35) {
        throw new UnsupportedOperationException("Method not decompiled: uf.k1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.ih):void");
    }

    public final void i() {
        a0.h hVar = this.f48622f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m9 = hVar2.m();
            for (int i10 = 0; i10 < m9; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.f48621e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f20990id);
                }
            }
        }
    }
}

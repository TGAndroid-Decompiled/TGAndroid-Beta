package uf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zp0;
import qh.l6;
public class k1 {
    public j1 f48654a;
    public ArrayList f48662k;
    public ArrayList f48663l;
    public String f48665n;
    public final boolean f48666o;
    public ArrayList f48668q;
    public HashMap f48669r;
    public final ArrayList f48655b = new ArrayList();
    public String f48656c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f48657e = new ArrayList();
    public final a0.h f48658f = new a0.h();
    public final ArrayList f48659g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f48660i = new a0.h();
    public final ArrayList f48661j = new ArrayList();
    public final int f48664m = UserConfig.selectedAccount;
    public boolean f48667p = true;
    public boolean f48670s = false;

    public k1(boolean z4) {
        this.f48666o = z4;
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
                if (this.f48669r == null) {
                    this.f48669r = new HashMap();
                    this.f48668q = new ArrayList();
                }
                i1 i1Var = (i1) this.f48669r.get(charSequence2);
                if (i1Var == 0) {
                    i1Var = new Object();
                    i1Var.f48639a = charSequence2;
                    this.f48669r.put(charSequence2, i1Var);
                } else {
                    this.f48668q.remove((Object) i1Var);
                }
                i1Var.f48640b = (int) (System.currentTimeMillis() / 1000);
                this.f48668q.add(0, i1Var);
                z4 = true;
            }
            if (z4) {
                MessagesStorage.getInstance(this.f48664m).getStorageQueue().postRunnable(new l6(27, this, this.f48668q));
            }
        }
    }

    public final void b() {
        this.f48657e.clear();
        this.f48658f.b();
        this.d.clear();
    }

    public final void c() {
        this.f48668q = new ArrayList();
        this.f48669r = new HashMap();
        MessagesStorage.getInstance(this.f48664m).getStorageQueue().postRunnable(new g1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f48655b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f48662k = arrayList;
        this.f48663l = arrayList2;
        a0.h hVar = this.f48658f;
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
                        obj = ((y) obj).f48775a;
                    }
                    if (obj instanceof zp0) {
                        obj = ((zp0) obj).f33994b;
                    }
                    boolean z4 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f48657e;
                    if (z4) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f20992id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f20992id);
                        }
                        long j10 = user.f20992id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f48659g.remove(tLObject);
                            hVar2.l(user.f20992id);
                        }
                        long j11 = user.f20992id;
                        a0.h hVar3 = this.f48660i;
                        Object f10 = hVar3.f(j11);
                        if (f10 != null) {
                            this.f48661j.remove(f10);
                            hVar3.l(user.f20992id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f20845id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f20845id);
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
        a0.h hVar = this.f48658f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m9 = hVar2.m();
            for (int i10 = 0; i10 < m9; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.f48657e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f20992id);
                }
            }
        }
    }
}

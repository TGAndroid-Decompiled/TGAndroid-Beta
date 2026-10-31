package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z implements Runnable {
    public final int f43925a;
    public final int f43926b;
    public final long f43927c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f43925a = i11;
        this.d = obj;
        this.e = obj2;
        this.f43926b = i10;
        this.f43927c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f43925a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z10 = false;
        long j10 = this.f43927c;
        int i11 = this.f43926b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                h4 h4Var = (h4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (h4Var.H0 != 0) {
                    h4Var.H0 = 0;
                    h4Var.Z(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        org.telegram.messenger.vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                        org.telegram.messenger.hs.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            h4Var.N(j10, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n6 n6Var = (n6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i11);
                if (currentTimeMillis - j10 > 250) {
                    z10 = true;
                }
                n6Var.a(valueOf, Boolean.valueOf(z10));
                return;
            case 2:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) obj2).getMessagesController().O1().b(i11, j10, (ArrayList) obj);
                return;
            case 3:
                lc.v vVar = (lc.v) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).f35403c;
                if (!z0Var.c(vVar, i11)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i11);
                    vVar.c();
                    return;
                }
                z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.v0 v0Var = z0Var.f35446o;
                try {
                    JSONArray put = new JSONArray().put(z0Var.f35436b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = z0Var.f35439g + 1;
                    z0Var.f35439g = i12;
                    sb2.append(i12);
                    z0Var.f35438f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", z0Var.f35438f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.i0.r(v0Var);
                    org.telegram.messenger.i0.h3(v0Var, 30000L);
                    z0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    z0Var.f("could not encode subscription");
                    return;
                }
            case 4:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.f43927c;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                e2Var.f34448f.sendRequestTyped(tonconnectgetpending, new a3.b(1), new org.telegram.ui.Wallet.o1(e2Var, (j70) obj, j11, this.f43926b, 0));
                return;
            case 5:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.p6) obj);
                String L0 = org.telegram.messenger.cd.L0(2131743099, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131743097, org.telegram.ui.Wallet.k0.x(i11).m(j10, true)));
                i0.a.w(null, 2131743089, alertDialog$Builder, null);
                return;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((org.telegram.messenger.hs) obj2).f15940b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i13);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.f20021id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i11);
                                sQLitePreparedStatement.bindLong(4, j10);
                                sQLitePreparedStatement.bindInteger(5, i13);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                ((vh.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.z2 z2Var = ((org.telegram.ui.ActionBar.z2[]) obj)[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                rh.e6.y(i11, false).R();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ha(j10));
                    return;
                }
                return;
        }
    }

    public z(ProfileActivity profileActivity, long j10, int i10, ArrayList arrayList) {
        this.f43925a = 2;
        this.d = profileActivity;
        this.f43927c = j10;
        this.f43926b = i10;
        this.e = arrayList;
    }

    public z(org.telegram.ui.Wallet.e2 e2Var, long j10, j70 j70Var, int i10) {
        this.f43925a = 4;
        this.d = e2Var;
        this.f43927c = j10;
        this.e = j70Var;
        this.f43926b = i10;
    }
}

package tf;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import eg.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.f9;
import org.telegram.messenger.pk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zw;
import org.telegram.ui.zn;
import uf.o1;
public final class u0 extends ql0 implements NotificationCenter.NotificationCenterDelegate {
    public String A0;
    public p0 B;
    public int B0;
    public String C;
    public f9 C0;
    public s0 D;
    public zn D0;
    public s0 E;
    public final f6 E0;
    public ArrayList F;
    public ArrayList G;
    public Object[] G0;
    public ArrayList H;
    public String I;
    public ArrayList J;
    public ArrayList K;
    public String[] L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public long P;
    public TLRPC.TL_inlineBotSwitchPM Q;
    public TLRPC.TL_inlineBotWebView R;
    public final la0 S;
    public a0.h T;
    public int U;
    public int V;
    public String W;
    public boolean X;
    public boolean Y;
    public int Z;
    public ArrayList f44899a0;
    public int f44903d0;
    public int f44906f0;
    public int f44907g0;
    public final Context h;
    public boolean f44908h0;
    public TLRPC.Chat f44909i0;
    public zw f44911k0;
    public boolean f44912l0;
    public m71 m0;
    public long f44913n;
    public String f44914n0;
    public String f44915o0;
    public String f44916p0;
    public int f44917q0;
    public final long f44918r;
    public int f44919r0;
    public final boolean f44920s;
    public boolean f44921s0;
    public TLRPC.User f44922t0;
    public boolean f44923u0;
    public TLRPC.ChatFull v;
    public m0 f44924v0;
    public final j1 f44925w;
    public Location f44926w0;
    public ArrayList f44927x;
    public ArrayList f44928x0;
    public a0.h f44929y;
    public HashMap f44930y0;
    public boolean f44901c = true;
    public boolean d = true;
    public boolean e = true;
    public int f44905f = UserConfig.selectedAccount;
    public boolean f44900b0 = true;
    public boolean f44902c0 = true;
    public boolean f44904e0 = true;
    public boolean f44910j0 = false;
    public final ArrayList f44931z0 = new ArrayList();
    public final l0 F0 = new l0(this, new k0(this));
    public boolean H0 = false;
    public int I0 = -1;

    public u0(Context context, long j10, long j11, la0 la0Var, f6 f6Var, boolean z4) {
        this.E0 = f6Var;
        this.h = context;
        this.S = la0Var;
        this.f44913n = j10;
        this.f44920s = z4;
        this.f44918r = j11;
        j1 j1Var = new j1(true);
        this.f44925w = j1Var;
        j1Var.f44819a = new o2.i(this, 21);
        NotificationCenter.getInstance(this.f44905f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f44905f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f44905f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f44905f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if ((this.f44922t0 == null || this.f44904e0) && this.f44928x0 == null) {
            return true;
        }
        return false;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.f19165id;
        HashMap hashMap = this.f44930y0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f44905f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.f44928x0 == null) {
                    this.f44928x0 = new ArrayList();
                    this.f44930y0 = new HashMap();
                }
                this.f44928x0.add(new t0(document, str));
                this.f44930y0.put(str2, document);
                zw zwVar = this.f44911k0;
                if (zwVar != null) {
                    zwVar.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            Object obj = str;
            while (i10 < size) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                String str2 = document.dc_id + "_" + document.f19165id;
                HashMap hashMap = this.f44930y0;
                if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f44905f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                    int size2 = document.attributes.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                        i11++;
                    }
                    if (this.f44928x0 == null) {
                        this.f44928x0 = new ArrayList();
                        this.f44930y0 = new HashMap();
                    }
                    this.f44928x0.add(new t0(document, obj));
                    this.f44930y0.put(str2, document);
                }
                i10++;
                obj = obj;
            }
        }
    }

    public final void G() {
        zn znVar = this.D0;
        if (znVar != null && znVar.getParentActivity() != null) {
            if (Build.VERSION.SDK_INT >= 23 && this.D0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.D0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
            TLRPC.User user = this.f44922t0;
            if (user != null && user.bot_inline_geo) {
                this.F0.start();
            }
        }
    }

    public final void H() {
        if (this.f44928x0 == null) {
            return;
        }
        ArrayList arrayList = this.f44931z0;
        arrayList.clear();
        int min = Math.min(6, this.f44928x0.size());
        for (int i10 = 0; i10 < min; i10++) {
            t0 t0Var = (t0) this.f44928x0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(t0Var.f44894a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f44905f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f44905f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, t0Var.f44894a), t0Var.f44895b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.f44922t0;
        if (user != null && user.f19306id != this.P) {
            return null;
        }
        return this.Q;
    }

    public final Object J(int i10) {
        String str;
        long j10;
        String str2;
        TLRPC.User user = null;
        if (this.C != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.f44928x0;
        if (arrayList != null) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                return ((t0) this.f44928x0.get(i10)).f44894a;
            }
        } else {
            ArrayList arrayList2 = this.O;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.R;
                if (tL_inlineBotWebView != null) {
                    if (i10 == 0) {
                        return tL_inlineBotWebView;
                    }
                } else {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.Q;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.O.get(i10);
                    }
                }
                i10--;
                if (i10 >= 0) {
                    return this.O.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.f44927x;
                if (arrayList3 != null) {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        return this.f44927x.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.F;
                    if (arrayList4 != null) {
                        if (i10 >= 0 && i10 < arrayList4.size()) {
                            return this.F.get(i10);
                        }
                    } else {
                        ArrayList arrayList5 = this.K;
                        if (arrayList5 != null) {
                            if (i10 >= 0 && i10 < arrayList5.size()) {
                                return this.K.get(i10);
                            }
                        } else {
                            ArrayList arrayList6 = this.J;
                            if (arrayList6 != null || this.G != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.J.get(i10);
                                    }
                                    ArrayList arrayList7 = this.J;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.G;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.M;
                                    if (arrayList9 != null && (this.f44903d0 != 1 || (this.v instanceof TLRPC.TL_channelFull))) {
                                        if (arrayList9.get(i10) != null) {
                                            user = (TLRPC.User) this.M.get(i10);
                                            Object obj = this.G.get(i10);
                                            if (user != null) {
                                                str2 = UserObject.getPublicUsername(user);
                                            } else {
                                                str2 = "";
                                            }
                                            str = String.format("%s@%s", obj, str2);
                                        } else {
                                            str = String.format("%s", this.G.get(i10));
                                        }
                                    } else {
                                        str = (String) this.G.get(i10);
                                    }
                                    ArrayList arrayList10 = this.N;
                                    if (arrayList10 != null && ((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        if (user != null) {
                                            j10 = user.f19306id;
                                        } else {
                                            j10 = 0;
                                        }
                                        return new r0(str, j10);
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int K() {
        int i10;
        int size;
        int i11;
        int i12 = 1;
        if (this.f44922t0 != null && !this.f44904e0) {
            return 1;
        }
        int i13 = 0;
        if (this.C != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f44928x0;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.O;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.Q == null && this.R == null) {
                    i12 = 0;
                }
                return size2 + i12 + i10;
            }
            ArrayList arrayList3 = this.f44927x;
            if (arrayList3 != null) {
                i11 = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.F;
                if (arrayList4 != null) {
                    i11 = arrayList4.size();
                } else if (this.G == null && this.J == null) {
                    ArrayList arrayList5 = this.K;
                    if (arrayList5 != null) {
                        i11 = arrayList5.size();
                    } else {
                        return i10;
                    }
                } else {
                    ArrayList arrayList6 = this.J;
                    if (arrayList6 == null) {
                        size = 0;
                    } else {
                        size = arrayList6.size();
                    }
                    ArrayList arrayList7 = this.G;
                    if (arrayList7 != null) {
                        i13 = arrayList7.size();
                    }
                    i11 = size + i13;
                }
            }
        }
        return i11 + i10;
    }

    public final Object L(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.f44928x0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((t0) this.f44928x0.get(i10)).f44895b;
    }

    public final int M(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        if (this.O != null) {
            if (this.Q != null || this.R != null) {
                return i10 - 1;
            }
            return i10;
        }
        return i10;
    }

    public final boolean N() {
        if (this.f44928x0 != null) {
            return true;
        }
        return false;
    }

    public final void P() {
        l0 l0Var = this.F0;
        if (l0Var != null) {
            l0Var.stop();
        }
        m0 m0Var = this.f44924v0;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.f44924v0 = null;
        }
        if (this.f44917q0 != 0) {
            ConnectionsManager.getInstance(this.f44905f).cancelRequest(this.f44917q0, true);
            this.f44917q0 = 0;
        }
        if (this.f44919r0 != 0) {
            ConnectionsManager.getInstance(this.f44905f).cancelRequest(this.f44919r0, true);
            this.f44919r0 = 0;
        }
        this.f44922t0 = null;
        this.Q = null;
        this.f44904e0 = true;
        this.f44914n0 = null;
        this.f44915o0 = null;
        this.f44921s0 = false;
        NotificationCenter.getInstance(this.f44905f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f44905f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f44905f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f44905f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.f44922t0;
        if (user != null && user.bot_inline_geo) {
            Location location = new Location("network");
            this.f44926w0 = location;
            location.setLatitude(-1000.0d);
            this.f44926w0.setLongitude(-1000.0d);
            T(true, this.f44922t0, this.f44915o0, "");
        }
    }

    public final void R(TLRPC.User user) {
        zn znVar;
        TLRPC.Chat chat;
        this.f44917q0 = 0;
        this.F0.stop();
        la0 la0Var = this.S;
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.f44922t0 = user;
            long j10 = user.f19306id;
            if (j10 != this.P) {
                this.Q = null;
                this.P = j10;
            }
            zn znVar2 = this.D0;
            if (znVar2 != null && (chat = znVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.f44904e0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    la0Var.a(true);
                    return;
                }
            }
            if (this.f44922t0.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f44905f);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.f44922t0.f19306id, false) && (znVar = this.D0) != null && znVar.getParentActivity() != null) {
                    TLRPC.User user2 = this.f44922t0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.D0.getParentActivity());
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.l1(this, zArr, user2, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.web.m(6, this, zArr));
                    this.D0.showDialog(alertDialog$Builder.f19478a, new gg.g(16, this, zArr));
                } else {
                    G();
                }
            }
        } else {
            this.f44922t0 = null;
            this.Q = null;
            this.f44904e0 = true;
        }
        if (this.f44922t0 == null) {
            this.f44921s0 = true;
            this.Q = null;
            return;
        }
        if (la0Var != null) {
            la0Var.b(true);
        }
        T(true, this.f44922t0, this.f44915o0, "");
    }

    public final void S(java.lang.String r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: tf.u0.S(java.lang.String, java.lang.String):void");
    }

    public final void T(boolean z4, TLRPC.User user, String str, String str2) {
        Object obj;
        Location location;
        if (this.f44919r0 != 0) {
            ConnectionsManager.getInstance(this.f44905f).cancelRequest(this.f44919r0, true);
            this.f44919r0 = 0;
        }
        if (this.f44904e0 && this.d) {
            if (str != null && user != null) {
                if (!user.bot_inline_geo || this.f44926w0 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f44913n);
                    sb.append("_");
                    sb.append(str);
                    sb.append("_");
                    sb.append(str2);
                    sb.append("_");
                    sb.append(this.f44913n);
                    sb.append("_");
                    sb.append(user.f19306id);
                    sb.append("_");
                    if (user.bot_inline_geo && this.f44926w0.getLatitude() != -1000.0d) {
                        obj = Double.valueOf(this.f44926w0.getLongitude() + this.f44926w0.getLatitude());
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    String sb2 = sb.toString();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f44905f);
                    pk pkVar = new pk(this, str, z4, user, str2, messagesStorage, sb2);
                    long j10 = user.f19306id;
                    if (j10 != this.P) {
                        this.Q = null;
                        this.P = j10;
                    }
                    if (z4) {
                        messagesStorage.getBotCache(sb2, pkVar);
                        return;
                    }
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f44905f).getInputUser(user);
                    tL_messages_getInlineBotResults.query = str;
                    tL_messages_getInlineBotResults.offset = str2;
                    if (user.bot_inline_geo && (location = this.f44926w0) != null && location.getLatitude() != -1000.0d) {
                        tL_messages_getInlineBotResults.flags |= 1;
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                        tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.f44926w0.getLatitude());
                        tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.f44926w0.getLongitude());
                    }
                    if (DialogObject.isEncryptedDialog(this.f44913n)) {
                        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f44905f).getInputPeer(this.f44913n);
                    }
                    this.f44919r0 = ConnectionsManager.getInstance(this.f44905f).sendRequest(tL_messages_getInlineBotResults, pkVar, 2);
                    return;
                }
                return;
            }
            this.f44915o0 = null;
            return;
        }
        la0 la0Var = this.S;
        if (la0Var != null) {
            la0Var.b(false);
        }
    }

    public final void U(java.lang.CharSequence r30, int r31, java.util.ArrayList r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: tf.u0.U(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void V(boolean z4) {
        this.f44901c = z4;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        zn znVar;
        TLRPC.Chat chat;
        this.f44905f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.f44904e0 && this.f44922t0 != null && (znVar = this.D0) != null && (chat = znVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.f44904e0 = canSendStickers;
            if (canSendStickers) {
                this.f44927x = null;
                l();
                this.S.a(false);
                R(this.f44922t0);
            }
        }
        String str = this.W;
        if (str != null) {
            U(str, this.Z, this.f44899a0, this.Y, this.X);
        }
    }

    public final void X(zn znVar) {
        this.D0 = znVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z4) {
        this.f44927x = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.f19306id)) {
                        it.remove();
                    }
                }
            }
        }
        this.f44929y = hVar;
        m71 m71Var = this.m0;
        if (m71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m71Var);
            this.m0 = null;
        }
        this.O = null;
        this.f44928x0 = null;
        if (z4) {
            l();
            this.S.a(!this.f44927x.isEmpty());
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f9 f9Var;
        boolean z4 = false;
        if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.fileLoadFailed) {
            if (i10 == NotificationCenter.recentDocumentsDidLoad) {
                f9 f9Var2 = this.C0;
                if (f9Var2 != null) {
                    AndroidUtilities.runOnUIThread(f9Var2);
                    this.C0 = null;
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (f9Var = this.C0) != null) {
                AndroidUtilities.runOnUIThread(f9Var);
                this.C0 = null;
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.f44928x0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f44931z0;
            if (!arrayList2.isEmpty() && this.f44912l0) {
                arrayList2.remove((String) objArr[0]);
                if (arrayList2.isEmpty()) {
                    if (K() > 0) {
                        z4 = true;
                    }
                    this.S.a(z4);
                }
            }
        }
    }

    @Override
    public final int h() {
        int K = K();
        this.I0 = K;
        return K;
    }

    @Override
    public final int j(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.f44928x0 != null) {
            return 4;
        }
        if (this.f44922t0 != null && !this.f44904e0) {
            return 3;
        }
        if (this.O != null) {
            if (i10 == 0) {
                if (this.Q != null || this.R != null) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z4;
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.I0;
        la0 la0Var = this.S;
        int i11 = 0;
        if (i10 != -1 && this.G0 != null) {
            int K = K();
            this.I0 = K;
            if (i10 != K) {
                z4 = true;
            } else {
                z4 = false;
            }
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.G0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof o1)) {
                            if (obj != obj2 && ((!(obj instanceof t0) || !(obj2 instanceof t0) || ((t0) obj).f44894a != ((t0) obj2).f44894a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).f19306id != ((TLRPC.User) obj2).f19306id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).f19159id != ((TLRPC.Chat) obj2).f19159id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                m(i11);
                z4 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z4 && la0Var != null) {
                la0Var.c();
            }
            this.G0 = objArr;
            return;
        }
        if (la0Var != null) {
            this.I0 = K();
            la0Var.c();
        }
        super.l();
        int K2 = K();
        this.I0 = K2;
        this.G0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.G0;
            if (i11 < objArr3.length) {
                objArr3[i11] = J(i11);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String str;
        TLRPC.User user;
        zn znVar;
        boolean z4;
        boolean z10;
        boolean z11;
        String str2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str3 = this.C;
        if (str3 != null) {
            i11 = i10 - 2;
        } else {
            i11 = i10;
        }
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        Boolean bool = null;
        if (i12 == 4) {
            a8 a8Var = (a8) view;
            if (i11 >= 0 && i11 < this.f44928x0.size()) {
                t0 t0Var = (t0) this.f44928x0.get(i11);
                TLRPC.Document document = t0Var.f44894a;
                Object obj = t0Var.f44895b;
                s1 s1Var = a8Var.f20816n;
                p9 p9Var = a8Var.f20812a;
                a8Var.f20814c = obj;
                boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
                a8Var.f20818s = isPremiumSticker;
                if (isPremiumSticker) {
                    s1Var.setColor(j6.w0(null, j6.f19881d6, false));
                    s1Var.E = true;
                    s1Var.F = false;
                    s1Var.invalidate();
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.f19827a7, 1.0f, 1.0f, a8Var.v);
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (svgThumb != null) {
                        p9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, a8Var.f20814c);
                        f10 = 1.0f;
                    } else if (closestPhotoSizeWithSize != null) {
                        f10 = 1.0f;
                        p9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, a8Var.f20814c);
                    } else {
                        f10 = 1.0f;
                        p9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, a8Var.f20814c);
                    }
                } else {
                    f10 = 1.0f;
                    if (svgThumb != null) {
                        if (closestPhotoSizeWithSize != null) {
                            p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, a8Var.f20814c);
                        } else {
                            p9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, a8Var.f20814c);
                        }
                    } else {
                        p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, a8Var.f20814c);
                    }
                }
                a8Var.f20813b = document;
                Drawable background = a8Var.getBackground();
                if (background != null) {
                    background.setAlpha(230);
                    background.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Be, false), PorterDuff.Mode.MULTIPLY));
                }
                if (a8Var.f20818s) {
                    a8Var.f20817r = true;
                } else {
                    a8Var.f20817r = false;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s1Var.getLayoutParams();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int dp = AndroidUtilities.dp(24.0f);
                    layoutParams.width = dp;
                    layoutParams.height = dp;
                    layoutParams.gravity = 81;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    layoutParams.width = dp2;
                    layoutParams.height = dp2;
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    s1Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                }
                s1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
                AndroidUtilities.updateViewVisibilityAnimated(s1Var, a8Var.f20817r, 0.9f, false);
                a8Var.invalidate();
                a8Var.setClearsInputField(true);
            }
        } else if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.D0.e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                }
            }
        } else if (i12 == 5) {
            uf.l1 l1Var2 = (uf.l1) view;
            ArrayList arrayList = this.J;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                l1Var2.a((o1) this.J.get(i11), this.I, false);
            }
        } else {
            ArrayList arrayList2 = this.O;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.Q;
                if (tL_inlineBotSwitchPM == null && this.R == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i12 == 2) {
                    if (z4) {
                        org.telegram.ui.Cells.i0 i0Var = (org.telegram.ui.Cells.i0) view;
                        if (tL_inlineBotSwitchPM != null) {
                            str2 = tL_inlineBotSwitchPM.text;
                        } else {
                            str2 = this.R.text;
                        }
                        i0Var.setText(str2);
                        return;
                    }
                    return;
                }
                if (z4) {
                    i11--;
                }
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    d2 d2Var = (d2) view;
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.O.get(i11);
                    TLRPC.User user2 = this.f44922t0;
                    boolean z12 = this.f44923u0;
                    if (i11 != this.O.size() - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z4 && i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d2Var.e(botInlineResult, user2, z12, z10, z11, "gif".equals(this.f44914n0));
                }
            } else if (i12 == 6) {
                s0 s0Var = (s0) view;
                int i13 = i11 + 2;
                if (i13 == 0) {
                    this.D = s0Var;
                } else {
                    this.E = s0Var;
                }
                TLRPC.Chat chat2 = this.f44909i0;
                if (chat2 == null && (znVar = this.D0) != null) {
                    chat2 = znVar.e;
                }
                s0Var.a(i13, str3, chat2);
            } else if (i12 == 7) {
            } else {
                g5 g5Var = (g5) view;
                ArrayList arrayList3 = this.f44927x;
                if (arrayList3 != null) {
                    TLObject tLObject = (TLObject) arrayList3.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        g5Var.setUser((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        g5Var.setChat((TLRPC.Chat) tLObject);
                    }
                } else {
                    ArrayList arrayList4 = this.F;
                    if (arrayList4 != null && i11 >= 0 && i11 < arrayList4.size()) {
                        g5Var.setText((String) this.F.get(i11));
                    } else {
                        ArrayList arrayList5 = this.K;
                        if (arrayList5 != null && i11 >= 0 && i11 < arrayList5.size()) {
                            g5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.K.get(i11));
                        } else {
                            ArrayList arrayList6 = this.G;
                            if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                                ArrayList arrayList7 = this.H;
                                if (arrayList7 != null && i11 >= 0 && i11 < arrayList7.size()) {
                                    str = (String) this.H.get(i11);
                                } else {
                                    str = null;
                                }
                                ArrayList arrayList8 = this.M;
                                if (arrayList8 != null && i11 >= 0 && i11 < arrayList8.size()) {
                                    user = (TLRPC.User) this.M.get(i11);
                                } else {
                                    user = null;
                                }
                                ArrayList arrayList9 = this.N;
                                if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                                    bool = (Boolean) this.N.get(i11);
                                }
                                boolean booleanValue = bool.booleanValue();
                                String str4 = (String) this.G.get(i11);
                                gg.q qVar = g5Var.f21057b;
                                TextView textView2 = g5Var.f21058c;
                                z8 z8Var = g5Var.d;
                                p9 p9Var2 = g5Var.f21056a;
                                g5Var.a();
                                if (user != null) {
                                    p9Var2.setVisibility(0);
                                    z8Var.r(user);
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                                        p9Var2.e(user, z8Var);
                                    } else {
                                        p9Var2.setImageDrawable(z8Var);
                                    }
                                } else {
                                    p9Var2.setVisibility(4);
                                }
                                textView2.setVisibility(0);
                                if (booleanValue) {
                                    lq lqVar = new lq(R.drawable.mini_ephemeral_hidden_14, 0);
                                    lqVar.setColorKey(j6.A6);
                                    lqVar.setTopOffset(1);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                                    spannableStringBuilder.append((CharSequence) " *");
                                    spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    qVar.setText(spannableStringBuilder);
                                } else {
                                    qVar.setText(str4);
                                }
                                textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        }
                    }
                }
                g5Var.setDivider(false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        TextView textView;
        int i11;
        int v02;
        f6 f6Var = this.E0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                int i12 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            boolean z4 = this.f44920s;
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ?? frameLayout = new FrameLayout(context);
                                    frameLayout.v = f6Var;
                                    p9 p9Var = new p9(context);
                                    frameLayout.f20812a = p9Var;
                                    p9Var.setAspectFit(true);
                                    p9Var.setLayerNum(1);
                                    frameLayout.addView(p9Var, b6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                                    frameLayout.setFocusable(true);
                                    s1 s1Var = new s1(context, 1, null);
                                    frameLayout.f20816n = s1Var;
                                    s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    s1Var.setImageReceiver(p9Var.getImageReceiver());
                                    frameLayout.addView(s1Var, b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                    textView = frameLayout;
                                } else {
                                    View q0Var = new q0(context, 0);
                                    if (z4) {
                                        v02 = j6.l1(0.15f, -1);
                                    } else {
                                        v02 = j6.v0(j6.f19827a7, f6Var);
                                    }
                                    mq mqVar = new mq(new ColorDrawable(v02), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f19846b7, f6Var)), 0, 0);
                                    mqVar.f27116w = true;
                                    q0Var.setBackground(mqVar);
                                    view = q0Var;
                                }
                            } else {
                                textView = new s0(context, f6Var, z4);
                            }
                        } else {
                            view = new uf.l1(context, f6Var, false);
                        }
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTextColor(j6.v0(j6.f20273z6, f6Var));
                        textView = textView2;
                    }
                } else {
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView3 = new TextView(context);
                    frameLayout2.f21166a = textView3;
                    textView3.setTextSize(1, 15.0f);
                    textView3.setTextColor(j6.w0(null, j6.Ce, false));
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setMaxLines(1);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView3.setGravity(i11);
                    if (!LocaleController.isRTL) {
                        i12 = 3;
                    }
                    frameLayout2.addView(textView3, b6.d(-2, -2.0f, i12 | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = frameLayout2;
                }
            } else {
                d2 d2Var = new d2(context);
                d2Var.setDelegate(new j0(this));
                textView = d2Var;
            }
            return new f2.l1(textView);
        }
        g5 g5Var = new g5(context, f6Var);
        g5Var.setIsDarkTheme(false);
        view = g5Var;
        textView = view;
        return new f2.l1(textView);
    }
}

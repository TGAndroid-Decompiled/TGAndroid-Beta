package pf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import f2.o1;
import gh.c6;
import h7.z5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import jh.b7;
import jh.s6;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.k2;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zm;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.ex0;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.tq0;
import org.telegram.ui.z71;

public class k extends yk0 implements l2 {
    public static final boolean Y = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public zk0 G;
    public wh0 H;
    public Drawable K;
    public final h L;
    public boolean M;
    public final gy N;
    public boolean O;
    public final TLRPC.RequestPeerType P;
    public boolean Q;
    public final long R;
    public boolean V;
    public boolean W;

    public final Context f45853c;
    public ArrayList d;

    public boolean f45854e;

    public int f45855f;
    public int h;

    public boolean f45856n;

    public final int f45857r;

    public long f45858s;
    public int v;

    public final boolean f45859w;

    public final ArrayList f45860x;

    public boolean f45861y;
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public int S = 10;
    public final LongSparseIntArray T = new LongSparseIntArray();
    public final HashMap U = new HashMap();
    public int X = -1;

    public k(gy gyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.f45853c = context;
        this.N = gyVar;
        this.h = i10;
        this.f45857r = i11;
        this.f45859w = z10;
        this.f45861y = i11 == 0 && i10 == 0 && !z10;
        this.f45860x = arrayList;
        this.B = i12;
        this.R = gyVar.T2;
        if (i11 == 0) {
            h hVar = new h();
            hVar.f45809a = new HashSet();
            hVar.f45810b = new HashSet();
            hVar.f45811c = new HashSet();
            hVar.d = new ArrayList();
            hVar.f45812e = new tq0(hVar, 12);
            this.L = hVar;
        }
        this.P = requestPeerType;
    }

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.f45857r;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.B).isDialogsEndReached(i11) ? 2 : 3;
        }
        if (i11 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int F(long j10) {
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            if (((i) this.I.get(i10)).f45823c != null && ((i) this.I.get(i10)).f45823c.f22384id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.A) {
            i10--;
        }
        if (this.f45861y) {
            i10 = pa.e(2, i10, MessagesController.getInstance(this.B).hintDialogs);
        }
        if (this.f45856n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        if (i11 == 11 || i11 == 13) {
            return i10 - 2;
        }
        return i11 == 12 ? i10 - 1 : i10;
    }

    public final MessagesController.DialogFilter H() {
        int i10 = this.h;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.B).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.I.size()) {
            i iVar = (i) this.I.get(i10);
            String str = iVar.f45830l;
            TLRPC.TL_contact tL_contact = iVar.f45824e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = iVar.f45831m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = iVar.f45832n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = iVar.f45823c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.B).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = iVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.f45856n = z10;
    }

    public final void N(wh0 wh0Var) {
        this.H = wh0Var;
    }

    public final void O(zk0 zk0Var, boolean z10) {
        this.F = z10;
        for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
            if (zk0Var.getChildAt(i10) instanceof p2) {
                ((p2) zk0Var.getChildAt(i10)).f24860f = z10;
            }
        }
        for (int i11 = 0; i11 < zk0Var.getCachedChildCount(); i11++) {
            if (zk0Var.P(i11) instanceof p2) {
                ((p2) zk0Var.P(i11)).f24860f = z10;
            }
        }
        for (int i12 = 0; i12 < zk0Var.getHiddenChildCount(); i12++) {
            if (zk0Var.V(i12) instanceof p2) {
                ((p2) zk0Var.V(i12)).f24860f = z10;
            }
        }
        for (int i13 = 0; i13 < zk0Var.getAttachedScrapChildCount(); i13++) {
            if (zk0Var.O(i13) instanceof p2) {
                ((p2) zk0Var.O(i13)).f24860f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.M = z10;
    }

    public final void Q(long j10) {
        this.f45858s = j10;
    }

    public final void R(cy cyVar) {
        this.G = cyVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i10 = this.B;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.E >= 2000) {
                this.E = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new b30(MessagesController.getInstance(i10), currentTime, 2));
                    if (z10) {
                        l();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
    }

    public final void U() {
        this.f45861y = this.f45857r == 0 && this.h == 0 && !this.f45859w && !MessagesController.getInstance(this.B).hintDialogs.isEmpty();
    }

    public final void V() {
        ArrayList arrayListR3;
        long j10;
        TLRPC.Dialog tL_dialog;
        boolean z10;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z11;
        int i13;
        i iVar;
        TLRPC.Dialog dialog;
        int i14;
        int i15;
        int i16;
        TLRPC.Dialog tL_dialog2;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i17 = this.B;
        long j11 = this.R;
        if (j11 != 0) {
            this.I.clear();
            U();
            MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(i17).buildCommunityPeers(j11);
            this.f45855f = communityPeersDialogBuildCommunityPeers.getDialogsCount();
            this.Q = false;
            int i18 = this.h == 3 ? 2 : 4;
            for (int i19 = 0; i19 < i18; i19++) {
                if (i19 == 0) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i19 == 1) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i19 == 2) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.I.add(new i(this, string));
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i20);
                        TLRPC.Dialog dialog2 = communityPeerDialog.dialog;
                        if (dialog2 != null) {
                            this.I.add(new i(this, 0, dialog2));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.I.add(new i(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.I.add(new i(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.I.clear();
        U();
        MessagesController messagesController = MessagesController.getInstance(i17);
        int i21 = this.f45857r;
        gy gyVar = this.N;
        if (j11 != 0) {
            arrayListR3 = messagesController.getDialogsByCommunity(j11);
        } else {
            arrayListR3 = gyVar.R3(i17, this.h, i21, this.C);
            if (arrayListR3 == null) {
                arrayListR3 = new ArrayList();
            }
        }
        int size = arrayListR3.size();
        this.f45855f = size;
        this.Q = false;
        if (size == 0 && gyVar.e4()) {
            pa.w(this, 19, this.I);
            return;
        }
        if (this.f45861y || this.h != 0 || i21 != 0 || !messagesController.isDialogsEndReached(i21) || this.f45854e) {
            j10 = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i17).doneLoadingContacts || ContactsController.getInstance(i17).contacts.isEmpty()) {
            j10 = 0;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(ContactsController.getInstance(i17).contacts);
            long j12 = UserConfig.getInstance(i17).clientUserId;
            int size2 = this.d.size();
            int i22 = 0;
            while (i22 < size2) {
                long j13 = ((TLRPC.TL_contact) this.d.get(i22)).user_id;
                if (j13 == j12 || messagesController.dialogs_dict.f(j13) != null) {
                    this.d.remove(i22);
                    i22--;
                    size2--;
                }
                i22++;
            }
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                T(false);
            }
        }
        MessagesController.DialogFilter dialogFilterH = H();
        if ((dialogFilterH != null && !dialogFilterH.isDefault()) || gyVar == null || !gyVar.J0 || gyVar.L0 == j10) {
            if ((dialogFilterH == null || dialogFilterH.isDefault()) && gyVar != null && this.h == 3 && gyVar.M0 != j10) {
                pa.w(this, 20, this.I);
                int i23 = 0;
                while (true) {
                    if (i23 >= arrayListR3.size()) {
                        tL_dialog2 = null;
                        break;
                    } else {
                        if (arrayListR3.get(i23).f22384id == gyVar.M0) {
                            tL_dialog2 = arrayListR3.get(i23);
                            break;
                        }
                        i23++;
                    }
                }
                if (tL_dialog2 == null) {
                    tL_dialog2 = new TLRPC.TL_dialog();
                    tL_dialog2.f22384id = gyVar.M0;
                }
                z10 = false;
                this.I.add(new i(this, 0, tL_dialog2));
                pa.w(this, 20, this.I);
            }
            this.A = z10;
            i10 = this.h;
            if ((i10 != 7 || i10 == 8) && dialogFilterH != null && dialogFilterH.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(dialogFilterH.f19622id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(dialogFilterH.f19622id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.A = true;
                    this.I.add(new i(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.P;
            if (requestPeerType != null) {
                pa.w(this, 15, this.I);
            }
            if (!this.F || this.O) {
                for (i11 = 0; i11 < arrayListR3.size(); i11++) {
                    if (this.h == 2 || !(arrayListR3.get(i11) instanceof ay)) {
                        this.I.add(new i(this, 0, arrayListR3.get(i11)));
                    } else {
                        this.I.add(new i(this, 14, arrayListR3.get(i11)));
                    }
                }
                pa.w(this, 10, this.I);
            }
            if (this.f45855f != 0 || !this.f45854e) {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                    if (this.f45855f == 0) {
                        this.Q = true;
                        if (requestPeerType != null) {
                            pa.w(this, 16, this.I);
                        } else {
                            this.I.add(new i(this, E(), 0));
                        }
                        pa.w(this, 8, this.I);
                        pa.w(this, 7, this.I);
                    } else {
                        for (int i24 = 0; i24 < arrayListR3.size(); i24++) {
                            this.I.add(new i(this, 0, arrayListR3.get(i24)));
                        }
                        pa.w(this, 8, this.I);
                        pa.w(this, 7, this.I);
                    }
                    for (int i25 = 0; i25 < this.d.size(); i25++) {
                        this.I.add(new i(this, (TLRPC.TL_contact) this.d.get(i25)));
                    }
                    pa.w(this, 10, this.I);
                    z11 = true;
                } else if (this.f45861y) {
                    int size3 = MessagesController.getInstance(i17).hintDialogs.size();
                    pa.w(this, 2, this.I);
                    for (int i26 = 0; i26 < size3; i26++) {
                        this.I.add(new i(this, MessagesController.getInstance(i17).hintDialogs.get(i26)));
                    }
                    pa.w(this, 3, this.I);
                } else {
                    int i27 = this.h;
                    if (i27 == 11 || i27 == 13) {
                        pa.w(this, 7, this.I);
                        pa.w(this, 12, this.I);
                    } else if (i27 == 12) {
                        pa.w(this, 7, this.I);
                    }
                }
                if (((requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f45855f > 0) {
                    pa.w(this, 12, this.I);
                }
                if (this.f45856n && this.h == 3) {
                    pa.w(this, 21, this.I);
                }
                if (!z11) {
                    for (i14 = 0; i14 < arrayListR3.size(); i14++) {
                        if (this.h == 2 || !(arrayListR3.get(i14) instanceof ay)) {
                            this.I.add(new i(this, 0, arrayListR3.get(i14)));
                        } else {
                            this.I.add(new i(this, 14, arrayListR3.get(i14)));
                        }
                    }
                    if (j11 == 0 || this.M || (i16 = this.h) == 7 || i16 == 8 || MessagesController.getInstance(i17).isDialogsEndReached(i21)) {
                        i15 = this.f45855f;
                        if (i15 == 0) {
                            this.Q = true;
                            if (requestPeerType != null) {
                                pa.w(this, 16, this.I);
                            } else {
                                this.I.add(new i(this, E(), 0));
                            }
                        } else {
                            if (i21 == 0 && i15 > 10 && this.h == 0) {
                                pa.w(this, 11, this.I);
                            }
                            pa.w(this, 10, this.I);
                        }
                    } else {
                        if (this.f45855f != 0) {
                            pa.w(this, 1, this.I);
                        }
                        pa.w(this, 10, this.I);
                    }
                }
                if (messagesController.hiddenUndoChats.isEmpty()) {
                    return;
                }
                i13 = 0;
                while (i13 < this.I.size()) {
                    iVar = (i) this.I.get(i13);
                    if (iVar.f49413a != 0 && (dialog = iVar.f45823c) != null && messagesController.isHiddenByUndo(dialog.f22384id)) {
                        this.I.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                return;
            }
            this.Q = true;
            if (requestPeerType != null) {
                pa.w(this, 16, this.I);
            } else {
                this.I.add(new i(this, E(), 0));
            }
            pa.w(this, 8, this.I);
            pa.w(this, 7, this.I);
            pa.w(this, 13, this.I);
            z11 = false;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                pa.w(this, 12, this.I);
            } else {
                pa.w(this, 12, this.I);
            }
            if (this.f45856n) {
                pa.w(this, 21, this.I);
            }
            if (!z11) {
                while (i14 < arrayListR3.size()) {
                    if (this.h == 2) {
                        this.I.add(new i(this, 0, arrayListR3.get(i14)));
                    } else {
                        this.I.add(new i(this, 0, arrayListR3.get(i14)));
                    }
                }
                if (j11 == 0) {
                    i15 = this.f45855f;
                    if (i15 == 0) {
                        this.Q = true;
                        if (requestPeerType != null) {
                            pa.w(this, 16, this.I);
                        } else {
                            this.I.add(new i(this, E(), 0));
                        }
                    } else {
                        if (i21 == 0) {
                            pa.w(this, 11, this.I);
                        }
                        pa.w(this, 10, this.I);
                    }
                } else {
                    i15 = this.f45855f;
                    if (i15 == 0) {
                        this.Q = true;
                        if (requestPeerType != null) {
                            pa.w(this, 16, this.I);
                        } else {
                            this.I.add(new i(this, E(), 0));
                        }
                    } else {
                        if (i21 == 0) {
                            pa.w(this, 11, this.I);
                        }
                        pa.w(this, 10, this.I);
                    }
                }
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
                i13 = 0;
                while (i13 < this.I.size()) {
                    iVar = (i) this.I.get(i13);
                    if (iVar.f49413a != 0) {
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        pa.w(this, 20, this.I);
        int i28 = 0;
        while (true) {
            if (i28 >= arrayListR3.size()) {
                tL_dialog = null;
                break;
            } else {
                if (arrayListR3.get(i28).f22384id == gyVar.L0) {
                    tL_dialog = arrayListR3.get(i28);
                    break;
                }
                i28++;
            }
        }
        if (tL_dialog == null) {
            tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.f22384id = gyVar.L0;
        }
        this.I.add(new i(this, 0, tL_dialog));
        pa.w(this, 20, this.I);
        z10 = false;
        this.A = z10;
        i10 = this.h;
        if (i10 != 7) {
            messagesController.checkChatlistFolderUpdate(dialogFilterH.f19622id, false);
            chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(dialogFilterH.f19622id);
            if (chatlistFolderUpdates != null) {
                this.A = true;
                this.I.add(new i(this, chatlistFolderUpdates));
            }
        } else {
            messagesController.checkChatlistFolderUpdate(dialogFilterH.f19622id, false);
            chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(dialogFilterH.f19622id);
            if (chatlistFolderUpdates != null) {
                this.A = true;
                this.I.add(new i(this, chatlistFolderUpdates));
            }
        }
        requestPeerType = this.P;
        if (requestPeerType != null) {
            pa.w(this, 15, this.I);
        }
        if (this.F) {
        }
        while (i11 < arrayListR3.size()) {
            if (this.h == 2) {
                this.I.add(new i(this, 0, arrayListR3.get(i11)));
            } else {
                this.I.add(new i(this, 0, arrayListR3.get(i11)));
            }
        }
        pa.w(this, 10, this.I);
    }

    public final void W(Runnable runnable) {
        if (this.V) {
            this.W = true;
            return;
        }
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.addAll(this.I);
        V();
        ArrayList arrayList2 = new ArrayList(this.I);
        ArrayList arrayList3 = this.J;
        this.I = arrayList3;
        fx fxVar = new fx(this, arrayList2, 3);
        if (arrayList3.size() >= 50 && Y) {
            Utilities.searchQueue.postRunnable(new ex0(this, fxVar, runnable, arrayList2, 19));
            return;
        }
        f2.m mVarC = f2.q.c(fxVar, true);
        this.V = false;
        if (runnable != null) {
            runnable.run();
        }
        this.I = arrayList2;
        mVarC.b(this);
    }

    @Override
    public final boolean b() {
        return this.f45860x.isEmpty();
    }

    @Override
    public final void c() {
        s6 storiesController = MessagesController.getInstance(this.B).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.N.getOrCreateStoryViewer().F(this.f45853c, null, arrayList2, 0, null, null, new b7(this.G, true), false);
    }

    @Override
    public final void e(p2 p2Var) {
        int i10 = this.B;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(p2Var.getDialogId())) {
            gy gyVar = this.N;
            gyVar.getOrCreateStoryViewer().getClass();
            gyVar.getOrCreateStoryViewer().D(gyVar.getParentActivity(), p2Var.getDialogId(), b7.a((zk0) p2Var.getParent()));
        }
    }

    @Override
    public final void f(p2 p2Var) {
        this.N.H4(p2Var);
    }

    @Override
    public final int h() {
        int size = this.I.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((i) this.I.get(i10)).f45829k;
    }

    @Override
    public final int j(int i10) {
        return ((i) this.I.get(i10)).f49413a;
    }

    @Override
    public void l() {
        if (this.V) {
            this.I = new ArrayList();
        }
        this.V = false;
        V();
        super.l();
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        TLRPC.Chat chat;
        Object obj;
        CharSequence charSequence;
        CharSequence string;
        CharSequence userName;
        boolean z10;
        CharSequence lowerCase;
        TLRPC.Chat chat2;
        int i11;
        String string2;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = this.B;
        gy gyVar = this.N;
        boolean z11 = false;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) I(i10);
            Object objI = I(i10 + 1);
            TLRPC.Dialog dialog2 = objI instanceof TLRPC.Dialog ? (TLRPC.Dialog) objI : null;
            int i14 = this.h;
            ArrayList arrayList = this.f45860x;
            if (i14 == 2 || i14 == 15) {
                e6 e6Var = (e6) view;
                long dialogId = e6Var.getDialogId();
                if (dialog.f22384id != 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog.f22384id));
                    if (chat != null && chat.migrated_to != null && (chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = chat2;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i15 = chat.participants_count;
                        if (i15 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Members", i15);
                        } else if (chat.has_geo) {
                            lowerCase = LocaleController.getString(R.string.MegaLocation);
                        } else {
                            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        }
                    } else {
                        int i16 = chat.participants_count;
                        lowerCase = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    string = lowerCase;
                    obj = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(dialog.f22384id));
                    if (user != null) {
                        userName = UserObject.getUserName(user);
                        if (UserObject.isReplyUser(user)) {
                            obj = user;
                            string = "";
                        } else {
                            obj = user;
                            string = user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(i13, user);
                        }
                    } else {
                        obj = null;
                        charSequence = null;
                        string = "";
                    }
                    if (dialog2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e6Var.I = z10;
                    e6Var.u(obj, null, charSequence, string, false, false);
                    e6Var.t(arrayList.contains(Long.valueOf(e6Var.getDialogId())), dialogId == e6Var.getDialogId());
                }
                charSequence = userName;
                if (dialog2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e6Var.I = z10;
                e6Var.u(obj, null, charSequence, string, false, false);
                e6Var.t(arrayList.contains(Long.valueOf(e6Var.getDialogId())), dialogId == e6Var.getDialogId());
            } else {
                p2 p2Var = (p2) view;
                p2Var.M0 = this.R != 0 && ChatObject.isHiddenInCommunity(i13, dialog.f22384id);
                p2Var.f24907o2 = false;
                p2Var.f24912p2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    p2Var.setDialogSelected(dialog.f22384id == this.f45858s);
                }
                p2Var.V(arrayList.contains(Long.valueOf(dialog.f22384id)), false);
                if (i10 == 1 && gyVar != null && gyVar.J0 && gyVar.L0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter dialogFilterH = H();
                    if (dialogFilterH == null || dialogFilterH.isDefault()) {
                        p2Var.setCustomMessage(DialogObject.getStatus(gyVar.L0));
                    } else {
                        p2Var.setCustomMessage(null);
                    }
                } else if (i10 == 1 && gyVar != null && this.h == 3 && gyVar.M0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter dialogFilterH2 = H();
                    if (dialogFilterH2 == null || dialogFilterH2.isDefault()) {
                        p2Var.setCustomMessage(DialogObject.getStatus(gyVar.M0));
                    } else {
                        p2Var.setCustomMessage(null);
                    }
                } else {
                    p2Var.setCustomMessage(null);
                }
                p2Var.X(dialog, this.h, this.f45857r);
                if (p2Var.getMeasuredHeight() > 0 && p2Var.getMeasuredHeight() != p2Var.z()) {
                    p2Var.requestLayout();
                }
                boolean z12 = p2Var.f24860f;
                boolean z13 = this.F;
                if (z12 != z13) {
                    p2Var.f24860f = z13;
                    p2Var.requestLayout();
                }
                h hVar = this.L;
                if (hVar != null && i10 < 10) {
                    long j10 = dialog.f22384id;
                    ArrayList arrayList2 = hVar.d;
                    if (!hVar.f45809a.contains(Long.valueOf(j10)) && !hVar.f45810b.contains(Long.valueOf(j10)) && !hVar.f45811c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
            }
            if (i10 >= this.f45855f + 1) {
                view.setAlpha(1.0f);
            }
        }
        if (i12 == 4) {
            ((q2) view).setRecentMeUrl((TLRPC.RecentMeUrl) I(i10));
        } else if (i12 == 5) {
            v2 v2Var = (v2) view;
            int i17 = this.X;
            int iE = E();
            this.X = iE;
            zz0 zz0Var = v2Var.f25796n;
            TextView textView = v2Var.h;
            ri0 ri0Var = v2Var.f25795f;
            if (v2Var.f25797r != iE) {
                v2Var.f25797r = iE;
                if (iE == 0 || iE == 1) {
                    i11 = R.raw.utyan_newborn;
                    string2 = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (iE != 2) {
                    ri0Var.setAutoRepeat(true);
                    i11 = R.raw.filter_new;
                    string2 = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    ri0Var.setAutoRepeat(false);
                    i11 = R.raw.filter_no_chats;
                    if (this.f45859w) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string2 = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string2 = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                if (i11 != 0) {
                    ri0Var.setVisibility(0);
                    if (v2Var.f25797r == 1) {
                        if (v2Var.d) {
                            v2Var.f25791a = 1.0f;
                            String string3 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string3 = string3.replace('\n', ' ');
                            }
                            zz0Var.a(string3, true, false);
                            v2Var.requestLayout();
                        } else {
                            v2Var.a(true);
                        }
                    }
                    if (v2Var.f25798s != i11) {
                        ri0Var.f(i11, 100, 100, null);
                        ri0Var.d();
                        v2Var.f25798s = i11;
                    }
                } else {
                    ri0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string2 = string2.replace('\n', ' ');
                }
                zz0Var.a(string2, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                v2Var.setOnUtyanAnimationEndListener(new e(this, z11 ? 1 : 0));
                v2Var.setOnUtyanAnimationUpdateListener(new c6(this, 5));
                if (!v2Var.d && this.f45855f == 0) {
                    gyVar.z4(0.0f);
                    for (fy fyVar : gyVar.f38498a0) {
                        ((f2.k0) fyVar.f38225a.getLayoutManager()).f5726u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.f45854e) {
                        if (this.f45855f == 0) {
                            v2Var.a(false);
                        }
                    } else if (v2Var.d && this.X == 0) {
                        ValueAnimator valueAnimator = v2Var.f25794e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        v2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(v2Var.f25791a, 0.0f).setDuration(250L);
                        v2Var.f25794e = duration;
                        duration.setInterpolator(ws.d);
                        v2Var.f25794e.addUpdateListener(new t2(v2Var, 1));
                        v2Var.f25794e.addListener(new u2(v2Var, 0));
                        v2Var.f25794e.start();
                    }
                } else if (!v2Var.d) {
                    v2Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((sa) view).e((TLRPC.User) I(i10), null, null, false);
        } else if (i12 == 7) {
            j4 j4Var = (j4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                j4Var.setText(LocaleController.getString((this.f45855f == 0 && this.f45854e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i10 == 0) {
                j4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                j4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.P;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        j4 j4Var2 = (j4) view;
                        j4Var2.setTextSize(14.0f);
                        j4Var2.setTextColor(g6.w0(null, g6.f23423y6, false));
                        j4Var2.setBackgroundColor(g6.w0(null, g6.f23073e7, false));
                        int i20 = ((ay) I(i10)).f36651a;
                        if (i20 == 0) {
                            j4Var2.setText(LocaleController.getString(R.string.MyChannels));
                        } else if (i20 == 1) {
                            j4Var2.setText(LocaleController.getString(R.string.MyGroups));
                        } else if (i20 == 2) {
                            j4Var2.setText(LocaleController.getString(R.string.FilterGroups));
                        }
                        break;
                    case 15:
                        ((n6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((z2) view).set(requestPeerType);
                        break;
                    case 17:
                        x2 x2Var = (x2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((i) this.I.get(i10)).f45827i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            x2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), g6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                s3 s3Var = (s3) view;
                                if (gyVar == null || !gyVar.J0) {
                                    if (this.h == 3) {
                                        if (i10 == 0) {
                                            s3Var.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                        } else {
                                            s3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                        }
                                    }
                                } else if (i10 == 0) {
                                    s3Var.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                } else {
                                    s3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                }
                                break;
                            case 21:
                                p2 p2Var2 = (p2) view;
                                k2 k2Var = new k2();
                                k2Var.f24561a = LocaleController.getString(R.string.StoriesForwardTitle);
                                k2Var.f24562b = LocaleController.getString(R.string.StoriesForwardText);
                                p2Var2.f24907o2 = false;
                                p2Var2.f24912p2 = false;
                                p2Var2.setDialog(k2Var);
                                if (p2Var2.getMeasuredHeight() > 0 && p2Var2.getMeasuredHeight() != p2Var2.z()) {
                                    p2Var2.requestLayout();
                                }
                                break;
                            case 22:
                                ((j4) view).setText((String) I(i10));
                                break;
                            case 23:
                                Object objI2 = I(i10);
                                p2 p2Var3 = (p2) view;
                                if (objI2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) objI2;
                                    p2Var3.M0 = ChatObject.isHiddenInCommunity(i13, chat3);
                                    p2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat3.participants_count, new Object[0]));
                                    p2Var3.W(-chat3.f22380id, null, 0, false, false);
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) objI2;
                                    p2Var3.M0 = ChatObject.isHiddenInCommunity(i13, user2);
                                    p2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    p2Var3.W(user2.f22527id, null, 0, false, false);
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (!(view instanceof l8)) {
                    return;
                }
                l8 l8Var = (l8) view;
                int i21 = g6.q6;
                l8Var.e(i21, i21);
                if (requestPeerType == null) {
                    l8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f45855f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    l8Var.m(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    l8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                l8Var.f24637x = true;
                l8Var.setOffsetFromImage(75);
            }
        } else {
            x8 x8Var = (x8) view;
            x8Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.K == null) {
                Drawable drawable = this.f45853c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.K = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            p80 textView2 = x8Var.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (gyVar == null || !gyVar.K3) ? this.K : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 >= this.f45855f + 1) {
            view.setAlpha(1.0f);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        ?? h00Var;
        long j10 = this.R;
        Context context = this.f45853c;
        switch (i10) {
            case 0:
            case 21:
                int i11 = this.h;
                if (i11 == 2 || i11 == 15) {
                    h00Var = new e6(context, null);
                } else {
                    p2 p2Var = new p2(this.N, this.f45853c, false, this.B, null);
                    if (S()) {
                        lh.n6 n6Var = new lh.n6(this, 10);
                        p2Var.F1 = true;
                        p2Var.G1 = n6Var;
                    }
                    p2Var.setArchivedPullAnimation(this.H);
                    p2Var.setPreloader(this.L);
                    p2Var.setDialogCellDelegate(this);
                    p2Var.setIsTransitionSupport(this.O);
                    if (i10 == 21) {
                        a7 a7Var = new a7(p2Var.getContext(), p2Var, false, R.drawable.forward_to_stories, p2Var.B4);
                        p2Var = p2Var;
                        p2Var.C = a7Var;
                        p2Var.B = true;
                    }
                    if (j10 != 0) {
                        p2Var.K0 = true;
                    }
                    h00Var = p2Var;
                }
                if (this.h == 15) {
                    h00Var.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                break;
            case 1:
            case 13:
                h00Var = new h00(context, null);
                h00Var.setIsSingleCell(true);
                int i12 = i10 == 13 ? 18 : 7;
                h00Var.setViewType(i12);
                if (i12 == 18) {
                    h00Var.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    h00Var.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                }
                break;
            case 2:
                h00Var = new j4(context);
                h00Var.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(g6.w0(null, g6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                h00Var.addView(textView, z5.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new c5(this, 15));
                break;
            case 3:
                h00Var = new z71(context, 7);
                h00Var.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(g6.V0(context, R.drawable.greydivider, g6.f23018b7));
                h00Var.addView(view, z5.c(-1.0f, -1));
                break;
            case 4:
                h00Var = new q2(context);
                ImageReceiver imageReceiver = new ImageReceiver(h00Var);
                h00Var.h = imageReceiver;
                h00Var.f25041n = new y8((org.telegram.ui.ActionBar.c6) null);
                h00Var.f25044w = AndroidUtilities.dp(40.0f);
                h00Var.B = AndroidUtilities.dp(10.0f);
                h00Var.D = UserConfig.selectedAccount;
                g6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                h00Var = new v2(context);
                break;
            case 6:
                h00Var = new sa(context, 8, 0, false);
                break;
            case 7:
                h00Var = new j4(context);
                gy gyVar = this.N;
                if (gyVar == null || !gyVar.J0) {
                    h00Var.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                }
                break;
            case 8:
                h00Var = new w6(context, (rl) null);
                dq dqVar = new dq(new ColorDrawable(g6.w0(null, g6.f22999a7, false)), g6.V0(context, R.drawable.greydivider, g6.f23018b7));
                dqVar.f27828w = true;
                h00Var.setBackgroundDrawable(dqVar);
                break;
            case 9:
            case 12:
            default:
                h00Var = new l8(context);
                if (this.h == 15) {
                    h00Var.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                break;
            case 10:
                h00Var = new j(this, context);
                break;
            case 11:
                h00Var = new g(this, context);
                dq dqVar2 = new dq(new ColorDrawable(g6.w0(null, g6.f22999a7, false)), g6.V0(context, R.drawable.greydivider, g6.f23018b7));
                dqVar2.f27828w = true;
                h00Var.setBackgroundDrawable(dqVar2);
                break;
            case 14:
                j4 j4Var = new j4(this.f45853c, g6.f23091f7, 16, 0, false, null);
                j4Var.setHeight(32);
                j4Var.setClickable(false);
                h00Var = j4Var;
                break;
            case 15:
                h00Var = new n6(context);
                h00Var.f24727b = new ArrayList();
                h00Var.setOrientation(1);
                h00Var.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
                break;
            case 16:
                h00Var = new f(this, context);
                break;
            case 17:
                h00Var = new x2(context);
                break;
            case 18:
                h00Var = new zm(context, 29);
                break;
            case 19:
                h00Var = new j(this, context);
                h00Var.addView(new p6(this.f45853c, this.B, null, new e(this, 1), null), z5.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                h00Var = new s3(context, null);
                break;
            case 22:
                h00Var = new j4(context);
                break;
            case 23:
                p2 p2Var2 = new p2(this.N, this.f45853c, false, this.B, null);
                if (j10 != 0) {
                    p2Var2.K0 = true;
                    p2Var2.L0 = true;
                }
                h00Var = p2Var2;
                break;
        }
        h00Var.setLayoutParams(new f2.y0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new lk0(h00Var);
    }

    @Override
    public final void y(o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            p2Var.T(this.D, false);
            p2Var.V(this.f45860x.contains(Long.valueOf(p2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    public void a(p2 p2Var) {
    }

    public void d(p2 p2Var) {
    }
}

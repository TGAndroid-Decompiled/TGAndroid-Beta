package pf;

import android.util.Pair;
import hh.l7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.yf;
import org.telegram.ui.zh1;

public class j1 {

    public i1 f45836a;

    public ArrayList f45844k;

    public ArrayList f45845l;

    public String f45847n;

    public final boolean f45848o;

    public ArrayList f45850q;

    public HashMap f45851r;

    public final ArrayList f45837b = new ArrayList();

    public String f45838c = null;
    public final ArrayList d = new ArrayList();

    public final ArrayList f45839e = new ArrayList();

    public final a0.h f45840f = new a0.h();

    public final ArrayList f45841g = new ArrayList();
    public final a0.h h = new a0.h();

    public final a0.h f45842i = new a0.h();

    public final ArrayList f45843j = new ArrayList();

    public final int f45846m = UserConfig.selectedAccount;

    public boolean f45849p = true;

    public boolean f45852s = false;

    public j1(boolean z10) {
        this.f45848o = z10;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
        boolean z10 = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (charSequence.charAt(iStart) != '@' && charSequence.charAt(iStart) != '#') {
                iStart++;
            }
            String string = charSequence.subSequence(iStart, iEnd).toString();
            if (this.f45851r == null) {
                this.f45851r = new HashMap();
                this.f45850q = new ArrayList();
            }
            h1 h1Var = (h1) this.f45851r.get(string);
            if (h1Var == null) {
                h1Var = new h1();
                h1Var.f45821a = string;
                this.f45851r.put(string, h1Var);
            } else {
                this.f45850q.remove(h1Var);
            }
            h1Var.f45822b = (int) (System.currentTimeMillis() / 1000);
            this.f45850q.add(0, h1Var);
            z10 = true;
        }
        if (z10) {
            MessagesStorage.getInstance(this.f45846m).getStorageQueue().postRunnable(new zh1(17, this, this.f45850q));
        }
    }

    public final void b() {
        this.f45839e.clear();
        this.f45840f.b();
        this.d.clear();
    }

    public final void c() {
        this.f45850q = new ArrayList();
        this.f45851r = new HashMap();
        MessagesStorage.getInstance(this.f45846m).getStorageQueue().postRunnable(new g1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        return this.f45837b.size() > 0;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Chat chat;
        this.f45844k = arrayList;
        this.f45845l = arrayList2;
        a0.h hVar = this.f45840f;
        if (hVar.m() != 0) {
            if (arrayList == null && arrayList2 == null) {
                return;
            }
            int i10 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i10 < size2) {
                Object obj = i10 < size ? arrayList.get(i10) : arrayList2.get(i10 - size);
                if (obj instanceof y) {
                    obj = ((y) obj).f45967a;
                }
                if (obj instanceof fp0) {
                    obj = ((fp0) obj).f28429b;
                }
                boolean z10 = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.f45839e;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(user.f22527id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        hVar.l(user2.f22527id);
                    }
                    long j10 = user.f22527id;
                    a0.h hVar2 = this.h;
                    TLObject tLObject = (TLObject) hVar2.f(j10);
                    if (tLObject != null) {
                        this.f45841g.remove(tLObject);
                        hVar2.l(user.f22527id);
                    }
                    long j11 = user.f22527id;
                    a0.h hVar3 = this.f45842i;
                    Object objF = hVar3.f(j11);
                    if (objF != null) {
                        this.f45843j.remove(objF);
                        hVar3.l(user.f22527id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f22380id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    hVar.l(-chat.f22380id);
                }
                i10++;
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j10, boolean z15, int i10, final int i11, final long j11, final yf yfVar) {
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        String str2;
        ArrayList arrayList = this.f45837b;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            i12 = this.f45846m;
            if (i13 >= size) {
                break;
            }
            Object obj = arrayList.get(i13);
            i13++;
            ConnectionsManager.getInstance(i12).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        a0.h hVar = this.f45840f;
        ArrayList arrayList3 = this.f45839e;
        a0.h hVar2 = this.h;
        ArrayList arrayList4 = this.f45841g;
        a0.h hVar3 = this.f45842i;
        ArrayList arrayList5 = this.f45843j;
        if (str == null) {
            arrayList4.clear();
            hVar2.b();
            arrayList3.clear();
            hVar.b();
            arrayList2.clear();
            arrayList5.clear();
            hVar3.b();
            this.f45836a.i(i11);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j10 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i10 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i10 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i10 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.f22379q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = MessagesController.getInstance(i12).getInputChannel(j10);
                z16 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new l7(this, str, z16, 8)));
            } else {
                z16 = z13;
                this.f45847n = str.toLowerCase();
            }
            z17 = false;
        } else {
            z16 = z13;
            arrayList4.clear();
            hVar2.b();
            z17 = true;
        }
        if (!z10) {
            z18 = z17;
        } else if (str.length() > 0) {
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f22426q = str;
            tL_contacts_search.limit = 20;
            final boolean z19 = z16;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z20;
                    boolean z21;
                    boolean z22;
                    boolean z23;
                    a0.h hVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList7;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    j1 j1Var = this.f45771a;
                    boolean z24 = j1Var.f45848o;
                    int i14 = j1Var.f45846m;
                    ArrayList arrayList8 = j1Var.d;
                    ArrayList arrayList9 = j1Var.f45839e;
                    a0.h hVar6 = j1Var.f45840f;
                    if (j1Var.f45836a.D0(i11) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject;
                        arrayList9.clear();
                        hVar6.b();
                        arrayList8.clear();
                        MessagesController.getInstance(i14).putChats(tL_contacts_found2.chats, false);
                        MessagesController.getInstance(i14).putUsers(tL_contacts_found2.users, false);
                        MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.h hVar7 = new a0.h();
                        a0.h hVar8 = new a0.h();
                        for (int i15 = 0; i15 < tL_contacts_found2.chats.size(); i15++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i15);
                            hVar7.k(chat3, chat3.f22380id);
                        }
                        for (int i16 = 0; i16 < tL_contacts_found2.users.size(); i16++) {
                            TLRPC.User user3 = tL_contacts_found2.users.get(i16);
                            hVar8.k(user3, user3.f22527id);
                        }
                        int i17 = 0;
                        while (true) {
                            z20 = z11;
                            z21 = z14;
                            z22 = z12;
                            z23 = z19;
                            if (i17 >= 2) {
                                break;
                            }
                            if (i17 == 0) {
                                if (z24) {
                                    arrayList7 = tL_contacts_found2.my_results;
                                }
                                i17++;
                                hVar7 = hVar7;
                                z24 = z24;
                            } else {
                                arrayList7 = tL_contacts_found2.results;
                            }
                            int i18 = 0;
                            while (i18 < arrayList7.size()) {
                                TLRPC.Peer peer = arrayList7.get(i18);
                                boolean z25 = z23;
                                int i19 = i18;
                                long j12 = peer.user_id;
                                if (j12 != 0) {
                                    user2 = (TLRPC.User) hVar8.f(j12);
                                    chat2 = null;
                                } else {
                                    long j13 = peer.chat_id;
                                    if (j13 != 0) {
                                        chat2 = (TLRPC.Chat) hVar7.f(j13);
                                    } else {
                                        long j14 = peer.channel_id;
                                        if (j14 != 0) {
                                            chat2 = (TLRPC.Chat) hVar7.f(j14);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 == null) {
                                    if (user2 != null && !z21 && ((z22 || !user2.bot) && ((z25 || !user2.self) && (j1Var.f45849p || i17 != 1 || user2.contact)))) {
                                        if (j1Var.d(user2)) {
                                            arrayList9.add(user2);
                                            hVar6.k(user2, user2.f22527id);
                                        }
                                    }
                                    hVar7 = hVar7;
                                    i18 = i19 + 1;
                                    z23 = z25;
                                } else if (z20 && ((!z21 || ChatObject.canAddBotsToChat(chat2)) && ((j1Var.f45849p || !ChatObject.isNotInChat(chat2)) && j1Var.d(chat2)))) {
                                    arrayList9.add(chat2);
                                    hVar6.k(chat2, -chat2.f22380id);
                                }
                                hVar7 = hVar7;
                                i18 = i19 + 1;
                                z23 = z25;
                            }
                            i17++;
                            hVar7 = hVar7;
                            z24 = z24;
                        }
                        a0.h hVar9 = hVar7;
                        if (!z24) {
                            int i20 = 0;
                            while (i20 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i20);
                                long j15 = peer2.user_id;
                                if (j15 != 0) {
                                    hVar4 = hVar9;
                                    user = (TLRPC.User) hVar8.f(j15);
                                    chat = null;
                                } else {
                                    long j16 = peer2.chat_id;
                                    if (j16 != 0) {
                                        hVar4 = hVar9;
                                        chat = (TLRPC.Chat) hVar4.f(j16);
                                    } else {
                                        hVar4 = hVar9;
                                        long j17 = peer2.channel_id;
                                        if (j17 != 0) {
                                            chat = (TLRPC.Chat) hVar4.f(j17);
                                        } else {
                                            chat = null;
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j18 = j11;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar8;
                                    if (user != null && !z21 && ((z22 || !user.bot) && ((z23 || !user.self) && user.f22527id != j18 && j1Var.d(user)))) {
                                        arrayList8.add(user);
                                        hVar6.k(user, user.f22527id);
                                    }
                                } else if (!z20 || (z21 && !ChatObject.canAddBotsToChat(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar8;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar8;
                                    if ((-chat.f22380id) != j18 && j1Var.d(chat)) {
                                        arrayList8.add(chat);
                                        hVar6.k(chat, -chat.f22380id);
                                    }
                                }
                                i20++;
                                tL_contacts_found2 = tL_contacts_found;
                                hVar8 = hVar5;
                                hVar9 = hVar4;
                            }
                        }
                        j1Var.f45838c = str.toLowerCase();
                    }
                }
            }));
            z18 = z17;
        } else {
            arrayList3.clear();
            hVar.b();
            arrayList2.clear();
            z18 = false;
        }
        if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
            arrayList5.clear();
            hVar3.b();
            String strD = oe.b.d(str, false);
            ArrayList<TLRPC.TL_contact> arrayList7 = ContactsController.getInstance(i12).contacts;
            int size2 = arrayList7.size();
            boolean z20 = false;
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList7.get(i14).user_id));
                if (user != null && (str2 = user.phone) != null && str2.startsWith(strD)) {
                    if (!z20) {
                        z20 = user.phone.length() == strD.length();
                    }
                    arrayList5.add(user);
                    hVar3.k(user, user.f22527id);
                }
            }
            if (!z20) {
                arrayList5.add("section");
                arrayList5.add(strD);
            }
            z18 = false;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList8 = new ArrayList();
        int i15 = 0;
        while (i15 < arrayList6.size()) {
            TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i15)).first;
            arrayList8.add(null);
            final AtomicInteger atomicInteger2 = new AtomicInteger();
            final AtomicInteger atomicInteger3 = atomicInteger;
            final ArrayList arrayList9 = arrayList8;
            final int i16 = i15;
            final ArrayList arrayList10 = arrayList6;
            atomicInteger2.set(ConnectionsManager.getInstance(i12).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final j1 j1Var = this.f45785a;
                    final ArrayList arrayList11 = arrayList9;
                    final int i17 = i16;
                    final AtomicInteger atomicInteger4 = atomicInteger2;
                    final AtomicInteger atomicInteger5 = atomicInteger3;
                    final ArrayList arrayList12 = arrayList10;
                    final int i18 = i11;
                    final Runnable runnable = yfVar;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pair pair = new Pair(tLObject2, tL_error);
                            ArrayList arrayList13 = arrayList11;
                            arrayList13.set(i17, pair);
                            Integer numValueOf = Integer.valueOf(atomicInteger4.get());
                            j1 j1Var2 = j1Var;
                            ArrayList arrayList14 = j1Var2.f45837b;
                            if (arrayList14.contains(numValueOf)) {
                                arrayList14.remove(numValueOf);
                                int iIncrementAndGet = atomicInteger5.incrementAndGet();
                                ArrayList arrayList15 = arrayList12;
                                if (iIncrementAndGet == arrayList15.size()) {
                                    for (int i19 = 0; i19 < arrayList15.size(); i19++) {
                                        RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i19)).second;
                                        Pair pair2 = (Pair) arrayList13.get(i19);
                                        if (pair2 != null) {
                                            requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                        }
                                    }
                                    j1Var2.i();
                                    ArrayList arrayList16 = j1Var2.f45844k;
                                    if (arrayList16 != null) {
                                        j1Var2.f(arrayList16, j1Var2.f45845l);
                                    }
                                    ArrayList arrayList17 = j1Var2.d;
                                    ArrayList arrayList18 = j1Var2.f45839e;
                                    a0.h hVar4 = j1Var2.f45840f;
                                    i1 i1Var = j1Var2.f45836a;
                                    if (i1Var != null) {
                                        a0.h hVarH0 = i1Var.h0();
                                        if (hVarH0 != null) {
                                            int iM = hVarH0.m();
                                            for (int i20 = 0; i20 < iM; i20++) {
                                                TLRPC.User user2 = (TLRPC.User) hVar4.f(hVarH0.j(i20));
                                                if (user2 != null) {
                                                    arrayList18.remove(user2);
                                                    arrayList17.remove(user2);
                                                    hVar4.l(user2.f22527id);
                                                }
                                            }
                                        }
                                        a0.h hVarJ = j1Var2.f45836a.J();
                                        if (hVarJ != null) {
                                            int iM2 = hVarJ.m();
                                            for (int i21 = 0; i21 < iM2; i21++) {
                                                TLRPC.User user3 = (TLRPC.User) hVar4.f(hVarJ.j(i21));
                                                if (user3 != null) {
                                                    arrayList18.remove(user3);
                                                    arrayList17.remove(user3);
                                                    hVar4.l(user3.f22527id);
                                                }
                                            }
                                        }
                                    }
                                    j1Var2.f45836a.i(i18);
                                    Runnable runnable2 = runnable;
                                    if (runnable2 != null) {
                                        runnable2.run();
                                    }
                                }
                            }
                        }
                    });
                }
            }));
            arrayList.add(Integer.valueOf(atomicInteger2.get()));
            i15 = i16 + 1;
            arrayList6 = arrayList10;
            atomicInteger = atomicInteger3;
            arrayList8 = arrayList9;
        }
        if (z18) {
            this.f45836a.i(i11);
        }
    }

    public final void i() {
        a0.h hVar = this.f45840f;
        if (hVar.m() == 0) {
            return;
        }
        a0.h hVar2 = this.h;
        int iM = hVar2.m();
        for (int i10 = 0; i10 < iM; i10++) {
            TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
            if (user != null) {
                this.f45839e.remove(user);
                this.d.remove(user);
                hVar.l(user.f22527id);
            }
        }
    }
}

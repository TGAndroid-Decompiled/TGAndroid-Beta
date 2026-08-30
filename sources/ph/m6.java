package ph;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.kg1;
public final class m6 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, xd.b {
    public boolean A0;
    public TLRPC.User B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public String F0;
    public int G0;
    public final g6 H0;
    public boolean I0;
    public final ArrayList J0;
    public final RectF K0;
    public final ArrayList L0;
    public final xd.a U;
    public final int V;
    public boolean W;
    public final m6 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList f41939a0;
    public final MessagesController.SavedMusicList f41940b0;
    public final Utilities.Callback f41941c0;
    public MessageObject f41942d0;
    public boolean f41943e0;
    public boolean f41944f0;
    public final FrameLayout f41945g0;
    public final ki f41946h0;
    public final ng.e f41947i0;
    public final sg.d f41948j0;
    public final sg.d f41949k0;
    public final ng.a f41950l0;
    public final kh.o2 m0;
    public w51 f41951n0;
    public MessageObject f41952o0;
    public String f41953p0;
    public int f41954q0;
    public boolean f41955r0;
    public boolean f41956s0;
    public boolean f41957t0;
    public String f41958u0;
    public int f41959v0;
    public final g6 f41960w0;
    public String f41961x0;
    public boolean f41962y0;
    public boolean f41963z0;

    public m6(Context context, boolean z4, m6 m6Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, false, 2, f6Var);
        nr nrVar = nr.h;
        this.U = new xd.a(0, this, nrVar, 380L, false);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f41939a0 = new ArrayList();
        this.f41959v0 = -1;
        this.f41960w0 = new Runnable(this) {
            public final m6 f41686b;

            {
                this.f41686b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f41686b.b0();
                        return;
                    case 1:
                        this.f41686b.a0();
                        return;
                    default:
                        m6.S(this.f41686b);
                        return;
                }
            }
        };
        this.E0 = -1;
        this.G0 = -2000000000;
        this.H0 = new Runnable(this) {
            public final m6 f41686b;

            {
                this.f41686b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f41686b.b0();
                        return;
                    case 1:
                        this.f41686b.a0();
                        return;
                    default:
                        m6.S(this.f41686b);
                        return;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.J0 = arrayList;
        RectF rectF = new RectF();
        this.K0 = rectF;
        arrayList.add(rectF);
        this.L0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-20.0f);
        this.W = z4;
        this.V = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.X = m6Var;
        this.f41941c0 = callback;
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f41947i0 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.f41949k0 = dVar;
            dVar.j(new h6(this));
            sg.d dVar2 = new sg.d(null);
            this.f41948j0 = dVar2;
            dVar2.j(new i6(this));
            ng.a aVar = new ng.a(dVar);
            this.f41950l0 = aVar;
            aVar.f14972f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f41947i0 = null;
            this.f41948j0 = null;
            this.f41949k0 = null;
            this.f41950l0 = new ng.a(cVar);
        }
        this.m0 = new kh.o2(this, 1);
        int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
        ki kiVar = new ki(context, i10, f6Var);
        this.f41946h0 = kiVar;
        kiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41945g0 = frameLayout;
        c20 c20Var = new c20(context, f6Var);
        c20Var.f23815r.setOnFocusChangeListener(new j6(this));
        c20Var.f23817w = true;
        c20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        c20Var.e();
        c20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c20Var.f23815r.addTextChangedListener(new k6(this));
        c20Var.f23815r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(kiVar, k7.b6.g());
        frameLayout.addView(c20Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        c20Var.setupBlurredBackground(this.f41950l0.c(c20Var, rg.b.m(f6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, k7.b6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i10));
        sl0 sl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i11, 0, i11, 0);
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(nrVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (!z4) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f41940b0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f41940b0 = null;
            if (this.W && !this.I0) {
                this.I0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final m6 f41686b;

                    {
                        this.f41686b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f41686b.b0();
                                return;
                            case 1:
                                this.f41686b.a0();
                                return;
                            default:
                                m6.S(this.f41686b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new l6(this));
        this.d.setOnItemClickListener(new nh.e0(this, callback, f6Var, 2));
    }

    public static void P(m6 m6Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = m6Var.f41939a0;
        boolean z4 = false;
        m6Var.f41963z0 = false;
        m6Var.A0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(m6Var.currentAccount).putUsers(messages_botresults.users, false);
            ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.BotInlineResult botInlineResult = arrayList2.get(i10);
                i10++;
                TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                    TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                    if (tL_botInlineMediaResult.document != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.out = true;
                        int i11 = m6Var.G0;
                        m6Var.G0 = i11 - 1;
                        tL_message.f19205id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(m6Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(m6Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            m6Var.f41961x0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(m6Var.f41961x0)) {
                z4 = true;
            }
            m6Var.f41962y0 = z4;
            m6Var.f41951n0.N(true);
            return;
        }
        m6Var.f41951n0.N(true);
    }

    public static void Q(m6 m6Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.h7) {
            MessageObject message = ((org.telegram.ui.Cells.h7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(m6Var.currentAccount).removeLoadingFileObserver(m6Var);
                if (m6Var.f41942d0 != null) {
                    FileLoader.getInstance(m6Var.currentAccount).cancelLoadFile(m6Var.f41942d0.getDocument());
                    m6Var.f41942d0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        m6Var.f41942d0 = message;
                        DownloadController.getInstance(m6Var.currentAccount).addLoadingFileObserver(fileName, message, m6Var);
                        FileLoader.getInstance(m6Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                m6Var.f41941c0.run(message);
                m6 m6Var2 = m6Var.X;
                if (m6Var2 != null) {
                    m6Var2.dismiss();
                }
                m6Var.dismiss();
                return;
            }
            return;
        }
        i51 G = m6Var.f41951n0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new m6(m6Var.getContext(), true, m6Var, callback, f6Var).show();
        } else if (G != null && G.d == 2) {
            m6Var.f41940b0.load();
        } else if (G != null && G.d == 3) {
            m6Var.b0();
        } else if (G != null && G.d == 4) {
            m6Var.a0();
        }
    }

    public static void R(m6 m6Var, TLObject tLObject) {
        ArrayList arrayList = m6Var.Z;
        boolean z4 = false;
        m6Var.f41957t0 = false;
        m6Var.f41956s0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(m6Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(m6Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(m6Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z4 = true;
            }
            m6Var.f41955r0 = z4;
            m6Var.f41954q0 = messages_messages.next_rate;
        } else {
            m6Var.f41955r0 = false;
            m6Var.f41954q0 = 0;
        }
        m6Var.f41951n0.N(true);
    }

    public static void S(m6 m6Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f16662id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f19205id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(m6Var.currentAccount).getClientUserId();
                tL_peerUser.user_id = clientUserId;
                peer.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                tL_message.attachPath = audioEntry.path;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = new TLRPC.TL_document();
                tL_message.flags |= 768;
                String fileExtension = FileLoader.getFileExtension(file);
                TLRPC.Document document = tL_message.media.document;
                document.f19190id = 0L;
                document.access_hash = 0L;
                document.file_reference = new byte[0];
                document.date = tL_message.date;
                StringBuilder sb = new StringBuilder();
                sb.append("audio/");
                if (fileExtension.length() <= 0) {
                    fileExtension = "mp3";
                }
                sb.append(fileExtension);
                document.mime_type = sb.toString();
                tL_message.media.document.size = (int) file.length();
                tL_message.media.document.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = audioEntry.duration;
                tL_documentAttributeAudio.title = audioEntry.title;
                tL_documentAttributeAudio.performer = audioEntry.author;
                tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                tL_documentAttributeFilename.file_name = file.getName();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                MessageObject messageObject = new MessageObject(m6Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new kg1(29, m6Var, arrayList));
    }

    public static void T(m6 m6Var, Long l10) {
        TLRPC.User user;
        boolean z4 = false;
        m6Var.C0 = false;
        if (l10 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(m6Var.currentAccount).getUser(l10);
        }
        m6Var.B0 = user;
        if (user == null) {
            z4 = true;
        }
        m6Var.D0 = z4;
        if (user != null) {
            m6Var.a0();
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.y3.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.y3.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void H(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f41947i0 != null) {
            X();
            sg.d dVar = this.f41948j0;
            if (dVar != null) {
                dVar.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            sg.d dVar2 = this.f41949k0;
            if (dVar2 != null) {
                dVar2.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.H(canvas, view);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            ki kiVar = this.f41946h0;
            kiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            kiVar.setVisibility(i11);
        }
    }

    public final int W(boolean z4, ArrayList arrayList, String str, ArrayList arrayList2, boolean z10, boolean z11, int i10) {
        String lowerCase;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z10)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f41953p0;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z4) {
                    messageObject.setQuery(this.f41953p0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Z) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f41953p0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z10) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(i51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f41951n0.U();
                arrayList.add(i51.t(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    dg.a0 a0Var = new dg.a0(this, 4);
                    int i14 = org.telegram.ui.Cells.g7.f21107a;
                    i51 J = i51.J(org.telegram.ui.Cells.g7.class);
                    J.G = (MessageObject) obj2;
                    J.H = a0Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z10) {
                    arrayList.add(i51.n(4));
                    arrayList.add(i51.n(4));
                    arrayList.add(i51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z11 && !z10) {
                    i51 c3 = i51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c3.f25570q = true;
                    arrayList.add(c3);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f41951n0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f41947i0) != null) {
            this.K0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.J0;
            ArrayList arrayList2 = this.L0;
            eVar.g(lf.l0.a(arrayList, 1, arrayList2), arrayList2);
            eVar.e(this.m0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Y() {
        if (this.E0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.E0, true);
        }
        this.E0 = -1;
        this.f41961x0 = "";
        this.f41962y0 = false;
        this.f41939a0.clear();
        this.f41963z0 = false;
        this.A0 = false;
    }

    public final void Z() {
        if (this.f41959v0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f41959v0, true);
        }
        this.f41959v0 = -1;
        this.f41954q0 = 0;
        this.Z.clear();
        this.f41956s0 = false;
        this.f41957t0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.F0;
            String str3 = this.f41953p0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.f41963z0 && !TextUtils.isEmpty(this.f41953p0) && this.f41953p0.length() >= 3) {
                ArrayList arrayList = this.f41939a0;
                if (arrayList.isEmpty() || this.f41962y0) {
                    if (this.B0 == null) {
                        this.B0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.B0 == null) {
                        if (!this.C0 && !this.D0) {
                            this.C0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new mg.i(this, 6));
                            return;
                        }
                        return;
                    }
                    this.f41963z0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.B0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f41961x0) == null) ? "" : "";
                    String str5 = this.f41953p0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.F0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.E0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new e6(this, 1));
                    this.f41951n0.N(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.W) {
            String str = this.f41958u0;
            String str2 = this.f41953p0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f41956s0) {
                ArrayList arrayList = this.Z;
                if (!arrayList.isEmpty() && !this.f41955r0) {
                    return;
                }
                this.f41956s0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f41953p0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f41958u0 = str3;
                tL_messages_searchGlobal.f19295q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) kh.a2.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f41954q0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f41959v0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new gf.a(this, 16));
                this.f41951n0.N(true);
            }
        }
    }

    public final void d0() {
        float f10 = AndroidUtilities.displaySize.y;
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.d;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        this.f41945g0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z4 = true;
        }
        this.U.a(z4, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f41951n0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f41952o0 != null && MediaController.getInstance().isPlayingMessage(this.f41952o0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f41952o0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.V;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.f41942d0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f41941c0.run(this.f41942d0);
            m6 m6Var = this.X;
            if (m6Var != null) {
                m6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, false, new e6(this, 0), this.resourcesProvider);
        this.f41951n0 = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override
    public final void z(float f10, int i10) {
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}

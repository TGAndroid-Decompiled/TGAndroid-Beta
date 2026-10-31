package vh;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.pp;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
public final class f5 extends ha implements us, org.telegram.messenger.z5, fe.e {
    public int A2;
    public final c5 B2;
    public boolean C2;
    public final fe.b P1;
    public final int Q1;
    public boolean R1;
    public final f5 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final pp W1;
    public final q20 X1;
    public jj Y1;
    public boolean Z1;
    public boolean a2;
    public final FrameLayout f51138b2;
    public final ih.e f51139c2;
    public final tg.f f51140d2;
    public final hi.c f51141e2;
    public final tg.b f51142f2;
    public final e5 f51143g2;
    public p51 f51144h2;
    public jj f51145i2;
    public String f51146j2;
    public int f51147k2;
    public boolean f51148l2;
    public boolean f51149m2;
    public boolean f51150n2;
    public String f51151o2;
    public int f51152p2;
    public final c5 f51153q2;
    public String f51154r2;
    public boolean f51155s2;
    public boolean f51156t2;
    public boolean f51157u2;
    public TLRPC.User f51158v2;
    public boolean f51159w2;
    public boolean f51160x2;
    public int f51161y2;
    public String f51162z2;

    public f5(Context context, boolean z10, f5 f5Var, q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2, context, p6Var, true);
        int L;
        gr grVar = gr.h;
        this.P1 = new fe.b(0, this, grVar, 380L, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.f51152p2 = -1;
        this.f51153q2 = new Runnable(this) {
            public final f5 f51033b;

            {
                this.f51033b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        f5 f5Var2 = this.f51033b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i10 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    query.getInt(0);
                                    String string = query.getString(r42);
                                    String string2 = query.getString(2);
                                    String string3 = query.getString(3);
                                    int i11 = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.f19814id = i10;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e = d20.i(f5Var2.f21583a).e();
                                        tL_peerUser.user_id = e;
                                        peer.user_id = e;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.b8.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.f19799id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i11;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new jj(f5Var2.f21583a, tL_message, false, true));
                                        i10--;
                                        query = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = query;
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new d1(11, f5Var2, arrayList));
                        return;
                    case 1:
                        this.f51033b.h1();
                        return;
                    default:
                        this.f51033b.g1();
                        return;
                }
            }
        };
        this.f51161y2 = -1;
        this.A2 = -2000000000;
        this.B2 = new Runnable(this) {
            public final f5 f51033b;

            {
                this.f51033b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        f5 f5Var2 = this.f51033b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i10 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    query.getInt(0);
                                    String string = query.getString(r42);
                                    String string2 = query.getString(2);
                                    String string3 = query.getString(3);
                                    int i11 = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.f19814id = i10;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e = d20.i(f5Var2.f21583a).e();
                                        tL_peerUser.user_id = e;
                                        peer.user_id = e;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.b8.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.f19799id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i11;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new jj(f5Var2.f21583a, tL_message, false, true));
                                        i10--;
                                        query = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = query;
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new d1(11, f5Var2, arrayList));
                        return;
                    case 1:
                        this.f51033b.h1();
                        return;
                    default:
                        this.f51033b.g1();
                        return;
                }
            }
        };
        this.f26672r1 = 0.35f;
        O();
        Y0();
        this.f26680z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-20.0f);
        this.R1 = z10;
        this.Q1 = org.telegram.messenger.b6.q(this.f21583a).k();
        this.S1 = f5Var;
        this.X1 = q20Var;
        hi.c d = this.X0.d(new d5(this));
        this.f51141e2 = d;
        if (Build.VERSION.SDK_INT >= 31 && tz.f()) {
            tg.f fVar = new tg.f(false);
            this.f51140d2 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(d);
            fVar2.f7719f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            tg.b bVar = new tg.b(fVar2);
            this.f51142f2 = bVar;
            bVar.f48702i = true;
            if (sc.e(262144)) {
                L = org.telegram.messenger.i0.L(8.0f);
            } else {
                L = org.telegram.messenger.i0.L(48.0f);
            }
            bVar.f48698b = L;
            bVar.f48699c = L;
            bVar.h = this.X0;
        } else {
            this.f51140d2 = null;
            this.f51142f2 = new tg.b(d);
        }
        this.f51143g2 = new ug.a() {
            @Override
            public final void d(Canvas canvas, RectF rectF) {
                f5 f5Var2 = f5.this;
                tk0 tk0Var = f5Var2.f26666k1;
                yg.d.b(tk0Var, canvas, rectF, tk0Var, f5Var2.f21586b, 255);
            }

            @Override
            public final void g(g.y yVar, RectF rectF) {
                yVar.f7258b = true;
            }
        };
        int i10 = org.telegram.ui.ActionBar.t6.f20872a7;
        ih.e eVar = new ih.e(i10, context, p6Var);
        this.f51139c2 = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51138b2 = frameLayout;
        h10 h10Var = new h10(context, p6Var);
        h10Var.f26588r.setOnFocusChangeListener(new m.r2(this, 3));
        h10Var.f26591x = true;
        h10Var.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        h10Var.updateColors();
        h10Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        h10Var.f26588r.addTextChangedListener(new rh.h0(this, 2));
        h10Var.f26588r.setHint(cd.L0(2131745853, null));
        frameLayout.addView(eVar, w7.b6.g());
        frameLayout.addView(h10Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        h10Var.setupBlurredBackground(this.f51142f2.c(h10Var, w7.b9.o(p6Var), false));
        frameLayout.setPadding(org.telegram.messenger.i0.L(8.0f) + this.f21615t0, 0, org.telegram.messenger.i0.L(8.0f) + this.f21615t0, 0);
        this.f21586b.addView(frameLayout, w7.b6.e(-1, -2, 55));
        w0(i10);
        tk0 tk0Var = this.f26666k1;
        int i11 = this.f21615t0;
        tk0Var.setPadding(i11, 0, i11, 0);
        this.f26666k1.r1();
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.f26666k1.setItemAnimator(jVar);
        if (!z10) {
            int i12 = this.f21583a;
            pp ppVar = new pp(i12, d20.i(i12).e());
            this.W1 = ppVar;
            ppVar.b();
            h1();
            g1();
        } else {
            this.W1 = null;
            if (this.R1 && !this.C2) {
                this.C2 = true;
                Utilities.e.c(new Runnable(this) {
                    public final f5 f51033b;

                    {
                        this.f51033b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                f5 f5Var2 = this.f51033b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    int i102 = -2000000000;
                                    while (query.moveToNext()) {
                                        try {
                                            query.getInt(0);
                                            String string = query.getString(r42);
                                            String string2 = query.getString(2);
                                            String string3 = query.getString(3);
                                            int i112 = (int) (query.getLong(4) / 1000);
                                            query.getString(5);
                                            File file = new File(string3);
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            tL_message.out = r42;
                                            tL_message.f19814id = i102;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e = d20.i(f5Var2.f21583a).e();
                                                tL_peerUser.user_id = e;
                                                peer.user_id = e;
                                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                                tL_message.message = "";
                                                tL_message.attachPath = string3;
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                tL_message.media = tL_messageMediaDocument;
                                                tL_messageMediaDocument.flags |= 3;
                                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                tL_message.flags |= 768;
                                                String D = org.telegram.messenger.b8.D(file);
                                                TLRPC.Document document = tL_message.media.document;
                                                document.f19799id = 0L;
                                                document.access_hash = 0L;
                                                document.file_reference = new byte[0];
                                                document.date = tL_message.date;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("audio/");
                                                if (D.length() <= 0) {
                                                    D = "mp3";
                                                }
                                                sb2.append(D);
                                                document.mime_type = sb2.toString();
                                                tL_message.media.document.size = (int) file.length();
                                                tL_message.media.document.dc_id = 0;
                                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                tL_documentAttributeAudio.duration = i112;
                                                tL_documentAttributeAudio.title = string2;
                                                tL_documentAttributeAudio.performer = string;
                                                tL_documentAttributeAudio.flags |= 3;
                                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                                tL_documentAttributeFilename.file_name = file.getName();
                                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                                arrayList.add(new jj(f5Var2.f21583a, tL_message, false, true));
                                                i102--;
                                                query = cursor;
                                                r42 = 1;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor = query;
                                        }
                                    }
                                    query.close();
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, true);
                                }
                                org.telegram.messenger.i0.g3(new d1(11, f5Var2, arrayList));
                                return;
                            case 1:
                                this.f51033b.h1();
                                return;
                            default:
                                this.f51033b.g1();
                                return;
                        }
                    }
                });
            }
        }
        this.f26666k1.setOnScrollListener(new bu0(this, 26));
        this.f26666k1.setOnItemClickListener(new org.telegram.ui.Cells.o(this, q20Var, p6Var, 2));
        this.X0.b(this.f26666k1);
        this.X0.i(this.f21586b);
        ei.r rVar = this.X0;
        rVar.f6670a = new d5(this);
        rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !sc.e.y(" ", str, lowerCase)) {
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                if (!N3.startsWith(str2) && !N3.contains(" ".concat(str2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, false, new b5(this, 0), this.I0);
        this.f51144h2 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final void M(String str) {
        jj jjVar = this.Y1;
        if (jjVar != null && TextUtils.equals(jjVar.S0(), str)) {
            this.X1.a(this.Y1);
            f5 f5Var = this.S1;
            if (f5Var != null) {
                f5Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131744627, null);
    }

    @Override
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    public final int d1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f51146j2;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String N3 = org.telegram.messenger.i0.N3(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                jj jjVar = (jj) obj;
                if (!z10) {
                    jjVar.J5(this.f51146j2, true);
                    arrayList3.add(jjVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.U1) {
                    String z13 = jjVar.z1(true);
                    String x12 = jjVar.x1(true);
                    if (i1(lowerCase, N3, z13) || i1(lowerCase, N3, x12)) {
                        jjVar.J5(this.f51146j2, true);
                        arrayList3.add(jjVar);
                    }
                } else {
                    jjVar.J5(null, true);
                    arrayList3.add(jjVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(a51.C(null));
                    i11 = org.telegram.messenger.i0.L(12.0f);
                } else {
                    i11 = 0;
                }
                this.f51144h2.V();
                arrayList.add(a51.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    jg.v vVar = new jg.v(this, 4);
                    int i14 = org.telegram.ui.Cells.j7.f22094b;
                    a51 K = a51.K(org.telegram.ui.Cells.j7.class);
                    K.G = (jj) obj2;
                    K.H = vVar;
                    arrayList.add(K);
                    i11 += org.telegram.messenger.i0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(a51.p(4));
                    arrayList.add(a51.p(4));
                    arrayList.add(a51.p(4));
                    i11 += org.telegram.messenger.i0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    a51 c10 = a51.c(i10, 2131230871, cd.L0(2131745357, null));
                    c10.f24297q = true;
                    arrayList.add(c10);
                    i11 += org.telegram.messenger.i0.L(50.0f);
                }
                this.f51144h2.U();
                return i11;
            }
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.T3) {
            this.f51144h2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f51145i2 != null && MediaController.B().I(this.f51145i2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f51145i2 = null;
    }

    public final void e1() {
        if (this.f51161y2 >= 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.f51161y2, true);
        }
        this.f51161y2 = -1;
        this.f51154r2 = "";
        this.f51155s2 = false;
        this.V1.clear();
        this.f51156t2 = false;
        this.f51157u2 = false;
    }

    public final void f1() {
        if (this.f51152p2 >= 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.f51152p2, true);
        }
        this.f51152p2 = -1;
        this.f51147k2 = 0;
        this.U1.clear();
        this.f51149m2 = false;
        this.f51150n2 = false;
    }

    public final void g1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.q0) vp.r1(this.f21583a).f18957y7.F.f13480b).f17539c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f51162z2;
            String str3 = this.f51146j2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                e1();
            }
            if (!this.f51156t2 && !TextUtils.isEmpty(this.f51146j2) && this.f51146j2.length() >= 3) {
                ArrayList arrayList = this.V1;
                if (arrayList.isEmpty() || this.f51155s2) {
                    if (this.f51158v2 == null) {
                        TLObject e22 = vp.r1(this.f21583a).e2(str);
                        if (e22 instanceof TLRPC.User) {
                            user = (TLRPC.User) e22;
                        } else {
                            user = null;
                        }
                        this.f51158v2 = user;
                    }
                    if (this.f51158v2 == null) {
                        if (!this.f51159w2 && !this.f51160x2) {
                            this.f51159w2 = true;
                            vp.r1(this.f21583a).c2().a(str, null, new ph.h1(this, 28));
                            return;
                        }
                        return;
                    }
                    this.f51156t2 = true;
                    TLRPC.User f7 = d20.i(this.f21583a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = vp.r1(this.f21583a).p1(this.f51158v2);
                    tL_messages_getInlineBotResults.peer = vp.m1(f7);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f51154r2) == null) ? "" : "";
                    String str5 = this.f51146j2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.f51162z2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.f51161y2 = ConnectionsManager.getInstance(this.f21583a).sendRequestTyped(tL_messages_getInlineBotResults, new a3.b(1), new b5(this, 1));
                    this.f51144h2.O(true);
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.Q1;
    }

    public final void h1() {
        if (!this.R1) {
            String str = this.f51151o2;
            String str2 = this.f51146j2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                f1();
            }
            if (!this.f51149m2) {
                ArrayList arrayList = this.U1;
                if (!arrayList.isEmpty() && !this.f51148l2) {
                    return;
                }
                this.f51149m2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f51146j2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f51151o2 = str3;
                tL_messages_searchGlobal.f19906q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    jj jjVar = (jj) i0.a.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = jjVar.f1();
                    tL_messages_searchGlobal.offset_rate = this.f51147k2;
                    tL_messages_searchGlobal.offset_peer = vp.r1(this.f21583a).i1(jj.C1(jjVar.f16337k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f51152p2 = ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_messages_searchGlobal, new ag.c(this, 23));
                this.f51144h2.O(true);
            }
        }
    }

    public final void j1() {
        float f7 = org.telegram.messenger.i0.f16026q.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.f26666k1;
            if (i10 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f51138b2.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m, f7));
        if (f7 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m) {
            z10 = true;
        }
        this.P1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f21583a).c(this, zs.T3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f21583a).n(this, zs.T3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            hi.c cVar = this.f51141e2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (i10 == 0) {
            ih.e eVar = this.f51139c2;
            eVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            eVar.setVisibility(i11);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void E(float f7, int i10) {
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}

package th;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import i7.x7;
import j$.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
public final class p3 extends u51 {
    public static final ArrayList f48633o4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public long B3;
    public float C3;
    public float D3;
    public boolean E3;
    public b2 F3;
    public int G3;
    public d1 H3;
    public final h I3;
    public ArrayList J3;
    public int K3;
    public int L3;
    public int M3;
    public boolean N3;
    public a O3;
    public boolean P3;
    public final h3 Q3;
    public final l2 R3;
    public final i3 S3;
    public final j3 T3;
    public final k3 U3;
    public final IdentityHashMap V3;
    public final IdentityHashMap W3;
    public a X3;
    public a Y3;
    public final l3 Z3;
    public final u2 f48634a4;
    public final int f48635b3;
    public final v2 f48636b4;
    public final c6 c3;
    public final w2 f48637c4;
    public final n3 f48638d3;
    public final x2 f48639d4;
    public MessageObject f48640e3;
    public g5 f48641e4;
    public boolean f48642f3;
    public j70 f48643f4;
    public TL_iv.RichMessage f48644g3;
    public int f48645g4;
    public final ArrayList f48646h3;
    public int f48647h4;
    public final HashMap f48648i3;
    public final m2 f48649i4;
    public final d3 f48650j3;
    public final y2 f48651j4;
    public final w9 f48652k3;
    public final o4.g f48653k4;
    public int f48654l3;
    public final ArrayList f48655l4;
    public int f48656m3;
    public ql0 f48657m4;
    public int f48658n3;
    public int f48659n4;
    public boolean f48660o3;
    public float f48661p3;
    public float f48662q3;
    public float f48663r3;
    public float f48664s3;
    public View f48665t3;
    public b f48666u3;
    public boolean f48667v3;
    public boolean f48668w3;
    public boolean f48669x3;
    public boolean f48670y3;
    public TL_iv.pageTableCell f48671z3;

    public p3(Context context, int i10, c6 c6Var, n3 n3Var) {
        super(context, i10, 0, false, new nh.t4(r1, 29), new sf.f1(r1, 6), null, c6Var);
        this.f48642f3 = true;
        this.f48646h3 = new ArrayList();
        this.f48648i3 = new HashMap();
        this.f48654l3 = -1;
        this.f48656m3 = -1;
        this.f48658n3 = 0;
        this.I3 = new h(this, 2);
        this.N3 = true;
        this.Q3 = new h3(this);
        this.R3 = new l2(this);
        this.S3 = new i3(this);
        this.T3 = new j3(this);
        this.U3 = new k3(this);
        this.V3 = new IdentityHashMap();
        this.W3 = new IdentityHashMap();
        this.Z3 = new l3(this);
        this.f48634a4 = new u2(this);
        this.f48636b4 = new v2(this);
        this.f48637c4 = new w2(this);
        this.f48639d4 = new x2(this);
        this.f48645g4 = -1;
        this.f48647h4 = -1;
        this.f48649i4 = new m2(this);
        this.f48651j4 = new y2(this);
        o4.g gVar = new o4.g(this, 17);
        this.f48653k4 = gVar;
        this.f48655l4 = new ArrayList();
        this.f48659n4 = -1;
        p3[] p3VarArr = {this};
        this.f48635b3 = i10;
        this.c3 = c6Var;
        this.f48638d3 = n3Var;
        this.U2.f29939r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new n2(this, 0), false);
        setReorderLongPressEnabled(false);
        w1(true);
        d3 d3Var = new d3(this, n3Var);
        this.f48650j3 = d3Var;
        d3Var.T(this);
        d3Var.E0 = this.T2;
        w9 o10 = d3Var.o(context);
        this.f48652k3 = o10;
        AndroidUtilities.removeFromParent(o10);
        d3Var.D = new f3(this, n3Var);
        j(new hh.l(9, this, n3Var));
        this.F3 = new b2(gVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!E3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !B3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean F3(a aVar) {
        if (aVar != null && !aVar.f48333i && !x3(aVar) && (aVar.f48328b instanceof TL_iv.pageBlockParagraph) && aVar.f48329c == 0 && aVar.d == 0 && !aVar.f48330e && aVar.f48335k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void I1(th.p3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.k51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.I1(th.p3[], java.util.ArrayList, org.telegram.ui.Components.k51):void");
    }

    public static void J2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f48328b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f48332g;
            if (sVar != null && sVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f48328b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f48328b.caption.text = new TL_iv.textEmpty();
                        aVar.f48328b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f48328b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f48332g;
            if (sVar2 != null && sVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f48328b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f48328b.caption.text = new TL_iv.textEmpty();
                        aVar.f48328b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f48328b);
                }
            }
        } else if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.f48328b);
            List Q3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; g32 != null && i12 < g32.size() && i12 < Q3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) g32.get(i12);
                if (((s) Q3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        h0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f48328b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f48328b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f48328b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                h0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f48328b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                s sVar3 = aVar.f48332g;
                if (sVar3 != null && sVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f48328b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f48328b.caption.text = new TL_iv.textEmpty();
                            aVar.f48328b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f48328b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                s sVar4 = aVar.f48332g;
                if (sVar4 != null && (document = sVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f22398id;
                }
                if (sVar4 != null && sVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f48328b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        h0.d(pageBlock7);
                        arrayList.add(aVar.f48328b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = g4.I;
                if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                    if (pageblockmap.caption == null) {
                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                        pageblockmap.caption = pageCaption;
                        pageCaption.text = new TL_iv.textEmpty();
                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(pageblockmap);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMath) {
                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                    arrayList.add(aVar.f48328b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
                        if (pagetablerow.cells != null) {
                            for (int i15 = 0; i15 < pagetablerow.cells.size(); i15++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i15);
                                if (pagetablecell.text == null) {
                                    x5.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i10 = pagetablecell.flags | 2;
                                } else {
                                    i10 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i10;
                                if (pagetablecell.rowspan > 1) {
                                    i11 = pagetablecell.flags | 4;
                                } else {
                                    i11 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i11;
                            }
                        }
                    }
                }
                if (O4(pageblocktable)) {
                    arrayList.add(pageblocktable);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
                ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList.add(pageblockbuttonrow);
                }
            } else {
                arrayList.add(pageBlock5);
            }
        }
    }

    public static void K1(p3 p3Var, int i10, int i11, int i12) {
        d1 editText;
        if (i10 >= 0) {
            View m10 = p3Var.T2.m(i10);
            if (m10 instanceof t5) {
                t5 t5Var = (t5) m10;
                if (i11 == 1 && t5Var.n()) {
                    editText = t5Var.getAuthorEditText();
                } else {
                    editText = t5Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof g5) {
                g5 g5Var = (g5) m10;
                d1 l10 = g5Var.l(i11);
                if (l10 == null) {
                    l10 = g5Var.l(0);
                }
                if (l10 != null) {
                    l10.s();
                    l10.setSelection(Math.max(0, Math.min(i12, l10.length())));
                }
            } else if (m10 instanceof i0) {
                d1 captionEditText = ((i0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock L1(th.p3 r2, th.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.L1(th.p3, th.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
        }
    }

    public static void M1(p3 p3Var, d1 d1Var) {
        if (d1Var == null) {
            p3Var.getClass();
            return;
        }
        d1Var.adaptiveCreateLinkDialog = p3Var.f48642f3;
        d1Var.setInlineButtonContext(p3Var.f48635b3);
        d1Var.setInlineButtonClickListener(new m2(p3Var));
    }

    public static void N1(a aVar, s sVar, p3 p3Var) {
        n3 n3Var = p3Var.f48638d3;
        IdentityHashMap identityHashMap = p3Var.W3;
        IdentityHashMap identityHashMap2 = p3Var.V3;
        if (sVar == null) {
            ArrayList arrayList = p3Var.f48646h3;
            for (s sVar2 : Q3(aVar)) {
                s4 s4Var = (s4) identityHashMap2.remove(sVar2);
                if (s4Var != null) {
                    s4Var.b();
                }
                o4 o4Var = (o4) identityHashMap.remove(sVar2);
                if (o4Var != null) {
                    o4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                b2 b2Var = p3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                arrayList.remove(indexOf);
                p3Var.U2.N(true);
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
            }
            n3Var.onContentChanged();
            return;
        }
        s4 s4Var2 = (s4) identityHashMap2.remove(sVar);
        if (s4Var2 != null) {
            s4Var2.b();
        }
        o4 o4Var2 = (o4) identityHashMap.remove(sVar);
        if (o4Var2 != null) {
            o4Var2.a();
        }
        b2 b2Var3 = p3Var.F3;
        if (b2Var3 != null) {
            b2Var3.d();
        }
        p3Var.q4(aVar, sVar);
        b2 b2Var4 = p3Var.F3;
        if (b2Var4 != null) {
            b2Var4.h();
        }
        n3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.f48330e = z11;
                            aVar.f48331f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        S1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            S1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock N3(a aVar, s sVar) {
        int i10;
        if (B3(aVar.f48328b)) {
            ArrayList g32 = g3(aVar.f48328b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(sVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && g32 != null && i10 < g32.size()) {
                return (TL_iv.PageBlock) g32.get(i10);
            }
            return null;
        }
        return aVar.f48328b;
    }

    public static void O1(p3 p3Var) {
        if (p3Var.E3) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        p3Var.f48638d3.b0();
        p3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i12 = 1;
            while (i11 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i12 = i13;
                }
                i12++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i11 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(v5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!x5.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(p3 p3Var, a aVar) {
        ArrayList arrayList = p3Var.f48646h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f48335k.addAll(aVar.f48335k);
        arrayList.add(indexOf + 1, aVar2);
        p3Var.s4();
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.post(new i2(p3Var, aVar2, 23));
    }

    public static FrameLayout P4(g5 g5Var, boolean z10) {
        int i10;
        j5 m10;
        x5 model = g5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : g5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (x5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m10 = g5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return g5Var;
    }

    public static boolean Q1(th.p3 r16, th.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.Q1(th.p3, th.a, boolean):boolean");
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.f48328b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        s sVar = aVar.f48332g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static d1 R3(View view) {
        if (view instanceof t5) {
            return ((t5) view).getEditText();
        }
        if (view instanceof i0) {
            return ((i0) view).getCaptionEditText();
        }
        if (view instanceof q0) {
            return ((q0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.f48330e = z10;
        aVar.f48331f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            return pageblockpreformatted;
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return new TL_iv.pageBlockFooter();
        } else {
            return new TL_iv.pageBlockParagraph();
        }
    }

    public static s T3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        s sVar = new s();
        sVar.f48713b = photoEntry.isVideo;
        sVar.f48715e = str;
        sVar.f48719j = photoEntry.width;
        sVar.f48720k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = photoEntry.orientation;
        }
        sVar.f48721l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        sVar.f48722m = i11;
        sVar.f48712a = 1;
        sVar.f48716f = 0.0f;
        return sVar;
    }

    public static g5 U2(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof g5) {
                return (g5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new a(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        W2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f48333i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = m0.a();
                        W2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f48335k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    O2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(g5 g5Var) {
        int i10;
        int i11;
        x5 x5Var = g5Var.B;
        if (x5Var != null) {
            i10 = x5Var.f48891g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            d1 l10 = g5Var.l(i10);
            if (l10 != null) {
                i11 = l10.length();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                return new int[]{i10, i11};
            }
            i10--;
        }
        return null;
    }

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(d1 d1Var, float f9, float f10) {
        if (d1Var != null && d1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            d1Var.getLocationOnScreen(iArr);
            float f11 = f9 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= d1Var.getWidth() && f12 <= d1Var.getHeight()) {
                int offsetForPosition = d1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                d1Var.s();
                d1Var.setSelection(Math.max(0, Math.min(offsetForPosition, d1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int k4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f48336l;
        } else {
            i11 = aVar.f48337m;
        }
        int size = aVar.f48335k.size() - i11;
        return org.telegram.messenger.x3.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !D3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f48335k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f48335k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                ((t5) childAt).setLocked(z10);
            } else if (childAt instanceof g5) {
                ((g5) childAt).setLocked(z10);
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof q0) {
                ((q0) childAt).setLocked(z10);
            } else if (childAt instanceof u0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int w2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        if (i10 != 32768) {
            return 4;
        }
        return 16388;
    }

    public static boolean x3(a aVar) {
        if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !t5.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean A1() {
        return this.P3;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f48646h3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (photo = sVar.f48717g) != null && hashSet.add(Long.valueOf(photo.f22416id))) {
                    arrayList.add(sVar.f48717g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View A4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.T2.m(i10);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f48646h3;
            if (i10 < arrayList2.size()) {
                for (s sVar : Q3((a) arrayList2.get(i10))) {
                    if (sVar.b() && (photo = sVar.f48717g) != null && hashSet.add(Long.valueOf(photo.f22416id))) {
                        arrayList.add(sVar.f48717g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] B4() {
        int i10;
        ArrayList arrayList = this.f48646h3;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            int indexOf = arrayList.indexOf(y4(d3Var.f24607u0));
            int indexOf2 = arrayList.indexOf(y4(d3Var.f24610x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a Q2 = Q2();
        if (Q2 != null) {
            i10 = arrayList.indexOf(Q2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void C1() {
        n3 n3Var = this.f48638d3;
        if (n3Var != null) {
            n3Var.G0();
        }
    }

    public final void C2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        ArrayList arrayList = this.f48646h3;
        SpannableStringBuilder k9 = u4.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.f48648i3;
        hashMap.clear();
        this.f48644g3 = null;
        W2(arrayList, u4.b(k9), hashMap);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        n3 n3Var = this.f48638d3;
        if (n3Var != null) {
            n3Var.onContentChanged();
            n3Var.s1();
        }
    }

    public final boolean C4() {
        int i10;
        int i11;
        int i12;
        int i13;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            if (L3()) {
                int i14 = d3Var.f24607u0;
                int i15 = d3Var.f24608v0;
                int i16 = d3Var.f24611y0;
                int i17 = d3Var.f24609w0;
                int i18 = d3Var.f24612z0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    d1 N4 = N4(i14, i19);
                    if (N4 != null) {
                        int length = N4.length();
                        if (i19 == i15) {
                            i12 = i17;
                        } else {
                            i12 = 0;
                        }
                        if (i19 == i16) {
                            i13 = i18;
                        } else {
                            i13 = length;
                        }
                        if (i15 == i16) {
                            i12 = Math.min(i17, i18);
                            i13 = Math.max(i17, i18);
                        }
                        if (Math.max(0, Math.min(i12, length)) < Math.max(0, Math.min(i13, length))) {
                            return true;
                        }
                    }
                }
            } else if (y3()) {
                d1 I2 = I2(d3Var.f24607u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(d3Var.f24609w0, d3Var.f24612z0), I2.length())) < Math.max(0, Math.min(Math.max(d3Var.f24609w0, d3Var.f24612z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                d1 s22 = s2(d3Var.f24607u0);
                if (s22 != null) {
                    int i20 = d3Var.f24609w0;
                    int i21 = d3Var.f24612z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), s22.length())) < Math.max(0, Math.min(Math.max(i20, i21), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                d1 j42 = j4(d3Var.f24607u0);
                if (j42 != null) {
                    int i22 = d3Var.f24609w0;
                    int i23 = d3Var.f24612z0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), j42.length())) < Math.max(0, Math.min(Math.max(i22, i23), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = d3Var.f24607u0;
                int i25 = d3Var.f24610x0;
                int i26 = d3Var.f24609w0;
                int i27 = d3Var.f24612z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f48655l4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a y42 = y4(i28);
                        if (y42 != null) {
                            if (y42.f48344t == 0) {
                                TL_iv.PageBlock pageBlock = y42.f48328b;
                                if (!A3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int i29 = i2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = i29;
                            }
                            if (Math.max(0, Math.min(i10, i29)) < Math.max(0, Math.min(i11, i29))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void D1() {
        n3 n3Var = this.f48638d3;
        if (n3Var != null) {
            n3Var.l1();
        }
        x4();
    }

    public final a D2() {
        int i10;
        a y42;
        a Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        d3 d3Var = this.f48650j3;
        if (d3Var != null && (i10 = d3Var.f24607u0) >= 0 && (y42 = y4(i10)) != null) {
            return y42;
        }
        return null;
    }

    public final int[] D4() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24610x0;
            if (i10 >= 0 && i11 >= 0) {
                a y42 = y4(i10);
                a y43 = y4(i11);
                if (y42 != null && y43 != null) {
                    ArrayList arrayList = this.f48646h3;
                    int indexOf = arrayList.indexOf(y42);
                    int indexOf2 = arrayList.indexOf(y43);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        if (indexOf > indexOf2) {
                            indexOf = indexOf2;
                            indexOf2 = indexOf;
                        }
                        return new int[]{indexOf, indexOf2};
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void E1(f2.n1 n1Var) {
        n3 n3Var = this.f48638d3;
        if (n3Var != null && n1Var != null) {
            View view = n1Var.f6432a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.P3 = n3Var.d(view.getHeight() + iArr[1]);
        }
    }

    public final void E2() {
        ArrayList arrayList;
        d3 d3Var = this.f48650j3;
        int i10 = d3Var.f24607u0;
        int i11 = d3Var.f24609w0;
        int i12 = d3Var.f24610x0;
        if (!W1(i10, i11, i12, d3Var.f24612z0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f48646h3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f48655l4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f48344t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f48648i3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f48335k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                x2();
                V3();
                s4();
                d3Var.f(false);
                this.U2.N(false);
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                post(new i2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void E4(d1 d1Var) {
        d1Var.adaptiveCreateLinkDialog = this.f48642f3;
        d1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void F1(f2.n1 n1Var) {
        a aVar = this.O3;
        this.O3 = null;
        this.P3 = false;
        if (aVar != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            r4(aVar);
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            n3 n3Var = this.f48638d3;
            if (n3Var != null) {
                n3Var.onContentChanged();
            }
        } else if (n1Var != null) {
            View view = n1Var.f6432a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean F2() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            d3Var.f(false);
            return true;
        } else if (this.f48641e4 == null) {
            return false;
        } else {
            M2();
            return true;
        }
    }

    public final void F4(th.g5 r33) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.F4(th.g5):void");
    }

    @Override
    public final void G1(f2.n1 n1Var) {
        int b10;
        w41 G;
        a aVar = null;
        if (n1Var != null && (b10 = n1Var.b()) >= 0 && (G = this.U2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.O3 = aVar;
        this.P3 = false;
        n3 n3Var = this.f48638d3;
        if (n3Var != null) {
            n3Var.k0();
        }
    }

    public final void G2() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null) {
            d3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.V3;
        for (s4 s4Var : identityHashMap.values()) {
            s4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.W3;
        for (o4 o4Var : identityHashMap2.values()) {
            o4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i10;
        a y42;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y() && (i10 = d3Var.f24607u0) == d3Var.f24610x0 && i10 >= 0 && i10 < this.f48655l4.size() && d3Var.f24608v0 == 1 && d3Var.f24611y0 == 1 && (y42 = y4(i10)) != null && t5.p(y42.f48328b)) {
            return true;
        }
        return false;
    }

    public final t5 G4() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24610x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && A3(y42.f48328b)) {
                return u2(i10);
            }
            return null;
        }
        return null;
    }

    public final int H2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f48646h3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f48333i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean H3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f48646h3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f48333i && !x3(aVar)) {
                        if (!aVar.f48335k.isEmpty() || t5.p(aVar.f48328b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable H4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (x3(y4(i10))) {
                d1 I2 = I2(i10);
                if (I2 != null) {
                    return I2.getText();
                }
                return null;
            } else if (G3()) {
                d1 j42 = j4(i10);
                if (j42 != null) {
                    return j42.getText();
                }
                return null;
            } else {
                a y42 = y4(i10);
                if (y42 != null && A3(y42.f48328b)) {
                    int i22 = i2(i10);
                    if (th.z(i11, i13, i22, 0) < th.c(i11, i13, i22, 0)) {
                        t5 u22 = u2(i10);
                        if (u22 != null) {
                            return u22.getEditText().getText();
                        }
                        return t5.A(y42.f48328b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final d1 I2(int i10) {
        if (!x3(y4(i10))) {
            return null;
        }
        View A4 = A4(i10);
        if (!(A4 instanceof q0)) {
            return null;
        }
        return ((q0) A4).getEditText();
    }

    public final boolean I3() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24610x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a y42 = y4(i10);
                    if (y42 != null) {
                        if (C3(y42.f48328b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean I4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.I4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean J3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.J3(int, int, int, int, int):boolean");
    }

    public final void J4(View view) {
        f2.n1 T;
        int b10;
        if (view != null && this.V2 != null && this.Y2 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.U2.H(b10) >= 0) {
            this.f48668w3 = true;
            d3 d3Var = this.f48650j3;
            if (d3Var.y()) {
                d3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.V2.r(T);
        }
    }

    public final boolean K3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            d1 N4 = N4(i11, i18);
            if (N4 != null) {
                int length = N4.length();
                if (i18 == i12) {
                    i16 = i13;
                } else {
                    i16 = 0;
                }
                if (i18 == i14) {
                    i17 = i15;
                } else {
                    i17 = length;
                }
                if (i12 == i14) {
                    i16 = Math.min(i13, i15);
                    i17 = Math.max(i13, i15);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else if ((N4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void K4(a aVar, s sVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f9;
        s4 s4Var = (s4) this.V3.remove(sVar);
        if (s4Var != null) {
            s4Var.b();
        }
        IdentityHashMap identityHashMap = this.W3;
        o4 o4Var = (o4) identityHashMap.remove(sVar);
        if (o4Var != null) {
            o4Var.a();
        }
        sVar.f48712a = 1;
        sVar.f48716f = 0.0f;
        o4 o4Var2 = new o4(this.f48635b3, photoEntry, new b3(aVar, sVar, this));
        identityHashMap.put(sVar, o4Var2);
        if (!o4Var2.f48619f && !o4Var2.h && !o4Var2.f48620n) {
            o4Var2.f48619f = true;
            int i11 = photoEntry.width;
            int i12 = photoEntry.height;
            if (i11 <= 0 || i12 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(photoEntry.path, options);
                    i11 = options.outWidth;
                    i12 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            VideoEditedInfo videoEditedInfo = null;
            r7 = null;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
            videoEditedInfo = null;
            if (i11 > 0 && i12 > 0) {
                int i13 = photoEntry.orientation;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i12;
                    i12 = i11;
                    i11 = i14;
                }
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = (float) 0;
                videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
                while (true) {
                    long j10 = videoEditedInfo2.endTime;
                    i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i10 <= 0 || j10 >= 1000) {
                        break;
                    }
                    videoEditedInfo2.endTime = j10 * 2;
                }
                if (i10 <= 0) {
                    videoEditedInfo2.endTime = 3000L;
                }
                long j11 = videoEditedInfo2.endTime;
                videoEditedInfo2.end = (float) j11;
                videoEditedInfo2.compressQuality = 1;
                videoEditedInfo2.rotationValue = 0;
                videoEditedInfo2.originalPath = photoEntry.path;
                videoEditedInfo2.estimatedSize = (int) ((f9 / 1000.0f) * 115200.0f);
                videoEditedInfo2.estimatedDuration = j11;
                videoEditedInfo2.framerate = 30;
                videoEditedInfo2.originalDuration = j11;
                videoEditedInfo2.filterState = photoEntry.savedFilterState;
                String str = photoEntry.croppedPaintPath;
                if (str != null) {
                    videoEditedInfo2.paintPath = str;
                    ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = photoEntry.croppedMediaEntities;
                    }
                    videoEditedInfo2.mediaEntities = arrayList;
                } else {
                    videoEditedInfo2.paintPath = photoEntry.paintPath;
                    videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
                }
                videoEditedInfo2.isPhoto = true;
                MediaController.CropState cropState = photoEntry.cropState;
                if (cropState != null) {
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        int i16 = i12;
                        i12 = i11;
                        i11 = i16;
                    }
                    i11 = (int) (i11 * cropState.cropPw);
                    i12 = (int) (i12 * cropState.cropPh);
                }
                float f10 = i11;
                float f11 = i12;
                float max = Math.max(f10 / 854.0f, f11 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i17 = (int) (f10 / max);
                int i18 = (int) (f11 / max);
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                if (i18 % 16 != 0) {
                    i18 = Math.max(1, Math.round(i18 / 16.0f)) * 16;
                }
                videoEditedInfo2.resultWidth = i17;
                videoEditedInfo2.originalWidth = i17;
                videoEditedInfo2.resultHeight = i18;
                videoEditedInfo2.originalHeight = i18;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.avatarStartTime = 0L;
                videoEditedInfo = videoEditedInfo2;
            }
            o4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22413id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                o4Var2.f48618e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(o4Var2.f48615a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                o4Var2.f48617c = messageObject;
                messageObject.videoEditedInfo = o4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(o4Var2.f48615a);
                notificationCenter.addObserver(o4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(o4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(o4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(o4Var2.f48617c, false, false, false);
                return;
            }
            o4Var2.b();
        }
    }

    public final boolean L3() {
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24610x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && (y42.f48328b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L4(a aVar, s sVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.V3;
        s4 s4Var = (s4) identityHashMap.remove(sVar);
        if (s4Var != null) {
            s4Var.b();
        }
        s4 s4Var2 = new s4(this.f48635b3, str, z10, i10, i11, i12, new c3(aVar, sVar, this));
        identityHashMap.put(sVar, s4Var2);
        s4Var2.d();
    }

    public final void M2() {
        if (this.f48669x3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f48669x3 = false;
        this.f48670y3 = false;
        this.f48671z3 = null;
        this.A3 = null;
        j70 j70Var = this.f48643f4;
        if (j70Var != null) {
            this.f48643f4 = null;
            j70Var.u();
        }
        g5 g5Var = this.f48641e4;
        if (g5Var != null) {
            LinkedHashSet linkedHashSet = g5Var.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                g5Var.v.invalidate();
                g5Var.t();
            }
            this.f48641e4 = null;
        }
        this.f48647h4 = -1;
        this.f48645g4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f48635b3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f48646h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += Q3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Z2 = Z2();
        ?? obj = new Object();
        obj.d = i11;
        obj.f48382b = Z2.size() + obj.f48382b;
        for (int i12 = 0; i12 < Z2.size(); i12++) {
            c2.b((TL_iv.PageBlock) Z2.get(i12), 1, obj);
        }
        if (obj.f48381a > appGlobalConfig.richMessageLengthLimit.get() || obj.f48382b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f48383c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.f48384e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof t5) {
            return ((t5) z12).getEditText().getText();
        }
        return t5.A(aVar.f48328b);
    }

    public final d1 N4(int i10, int i11) {
        View A4 = A4(i10);
        if (!(A4 instanceof g5)) {
            return null;
        }
        return ((g5) A4).l(i11);
    }

    public final int[] O3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.J3.size(); i12++) {
            int length = t5.z(((a) this.J3.get(i12)).f48328b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.J3.size() - 1;
        return new int[]{size, t5.z(((a) this.J3.get(size)).f48328b).length()};
    }

    public final d1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                return ((t5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f48646h3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (x3(aVar)) {
                    i11++;
                } else if (aVar.f48333i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a Q2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                if (t5Var.getEditText().isFocused() || (t5Var.n() && t5Var.h.isFocused())) {
                    return t5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        boolean z10;
        int[] B4 = B4();
        if (B4 != null) {
            int i10 = B4[0];
            int i11 = B4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f48646h3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (H3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f48333i;
                            ArrayList arrayList2 = aVar.f48335k;
                            if (!z11 && !x3(aVar)) {
                                if (t5.p(aVar.f48328b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f48328b.text;
                                    aVar.f48328b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a4.w.t(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = m0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f48333i;
                            ArrayList arrayList3 = aVar2.f48335k;
                            if (!z12 && !x3(aVar2)) {
                                if (t5.p(aVar2.f48328b)) {
                                    long a10 = m0.a();
                                    TL_iv.RichText k9 = t5.k(aVar2.f48328b);
                                    if (k9 != null && !(k9 instanceof TL_iv.textEmpty)) {
                                        this.f48648i3.put(Long.valueOf(a10), k9);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f48328b.text;
                                    aVar2.f48328b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    x2();
                    V3();
                    s4();
                    d3 d3Var = this.f48650j3;
                    if (d3Var != null && d3Var.y()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.U2.N(false);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    if (z10) {
                        post(new sf.a(this, aVar3, aVar4, 9));
                    } else {
                        post(new i2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void R1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.R1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final g5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return U2((d1) findFocus);
        }
        return null;
    }

    public final void R4(th.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.R4(th.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document S2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        TLRPC.Document document2 = null;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48646h3.size(); i12++) {
            for (s sVar : Q3((a) this.f48646h3.get(i12))) {
                if (sVar != null && (document = sVar.h) != null && document.f22398id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f48644g3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f22398id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = n4.f48593a;
        synchronized (n4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) n4.f48594b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean S4() {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.S4():boolean");
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        p3 p3Var;
        if (aVar != null && D3(aVar.f48328b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                s T3 = T3(photoEntry, str2);
                boolean c3 = o4.c(photoEntry);
                if (!photoEntry.isVideo && !c3) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (B3(aVar.f48328b)) {
                    g3(aVar.f48328b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    s sVar = aVar.f48332g;
                    if (sVar != null && sVar.f48712a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f48328b.caption;
                        h0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f48328b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f48332g);
                        aVar.h.add(T3);
                        aVar.f48332g = null;
                        aVar.f48328b = pageblockcollage;
                    } else {
                        aVar.f48328b = pageblockvideo;
                        aVar.f48332g = T3;
                    }
                }
                this.U2.N(false);
                n4(aVar);
                if (c3) {
                    K4(aVar, T3, photoEntry);
                    p3Var = this;
                } else {
                    p3Var = this;
                    p3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.f48638d3.onContentChanged();
            }
        }
    }

    public final int T2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f48646h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f48333i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (x3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f48328b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f48333i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f48328b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean T4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.T4(android.view.View, float, float):boolean");
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f48644g3;
            if (richMessage2 == null) {
                this.f48644g3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f48644g3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            W2(arrayList4, richMessage.blocks, this.f48648i3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    v4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f48646h3;
                int size = arrayList5.size();
                a Q2 = Q2();
                if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
                    TL_iv.PageBlock pageBlock = Q2.f48328b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && t5.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                V3();
                s4();
                this.U2.N(false);
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                n3 n3Var = this.f48638d3;
                if (n3Var != null) {
                    n3Var.onContentChanged();
                }
            }
        }
    }

    public final a U3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f48655l4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f48333i) {
                    if (aVar.f48344t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f48328b;
                        if (E3(pageBlock) && !l3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i10 += i11;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f48646h3;
            if (arrayList.indexOf(aVar2) >= 0 && !x3(aVar2) && !aVar2.f48333i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f48328b;
                if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
                    t5 u22 = u2(arrayList.indexOf(aVar2));
                    if (u22 != null) {
                        A = u22.getEditText().getText();
                    } else {
                        A = t5.A(aVar2.f48328b);
                    }
                    t5.d(pageBlock, A);
                    TL_iv.RichText k9 = t5.k(aVar2.f48328b);
                    if (k9 != null && t5.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k9;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k9;
                        }
                    }
                }
                R4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a V1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f48655l4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f48344t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void V2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                t5Var.f48780f.n();
                t5Var.h.n();
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48646h3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f48335k.isEmpty() && t5.p(aVar.f48328b)) {
                    long a2 = m0.a();
                    TL_iv.RichText k9 = t5.k(aVar.f48328b);
                    if (k9 != null && !(k9 instanceof TL_iv.textEmpty)) {
                        this.f48648i3.put(Long.valueOf(a2), k9);
                    }
                    aVar.f48335k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f48328b.text;
                    aVar.f48328b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.f48329c, aVar2.d, aVar2.f48330e, aVar2.f48331f);
    }

    public final boolean W1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.W1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean W3(th.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.W3(th.a, boolean):boolean");
    }

    public final void W4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            U4(aVar2, aVar2.f48328b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f48329c);
        if (i10 == 2) {
            i11 = Math.max(1, aVar2.d);
        } else {
            i11 = 0;
        }
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_iv.PageBlock pageBlock = aVar2.f48328b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f48331f) {
            z11 = true;
        } else {
            z11 = false;
        }
        U4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void X1() {
        t5 t5Var;
        a aVar;
        q5 q5Var;
        this.U2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof t5) && (aVar = (t5Var = (t5) childAt).f48785x) != null && (q5Var = t5Var.f48786y) != null) {
                t5Var.g(aVar, q5Var, t5Var.A);
            }
        }
    }

    public final void X3() {
        int length;
        int z10;
        int c3;
        int length2;
        int z11;
        int c6;
        int length3;
        int z12;
        int c10;
        int length4;
        int z13;
        int c11;
        d1 N4;
        int length5;
        int z14;
        int c12;
        boolean L3 = L3();
        d3 d3Var = this.f48650j3;
        if (L3) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24608v0;
            if (i11 == d3Var.f24611y0 && (N4 = N4(i10, i11)) != null && (z14 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length5 = N4.length()), 0)) < (c12 = th.c(d3Var.f24609w0, d3Var.f24612z0, length5, 0))) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (v5.h(N4.getText(), z14, c12)) {
                    v5.n(N4.getText(), z14, c12);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(z14, c12);
                N4.makeSelectedDate();
            }
        } else if (y3()) {
            int i12 = d3Var.f24607u0;
            d1 I2 = I2(i12);
            if (I2 != null && (z13 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length4 = I2.length()), 0)) < (c11 = th.c(d3Var.f24609w0, d3Var.f24612z0, length4, 0))) {
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (v5.h(I2.getText(), z13, c11)) {
                    v5.n(I2.getText(), z13, c11);
                    I2.invalidateEffects();
                    e4(i12);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(z13, c11);
                I2.makeSelectedDate();
            }
        } else if (w3()) {
            int i13 = d3Var.f24607u0;
            d1 s22 = s2(i13);
            if (s22 != null && (z12 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length3 = s22.length()), 0)) < (c10 = th.c(d3Var.f24609w0, d3Var.f24612z0, length3, 0))) {
                b2 b2Var5 = this.F3;
                if (b2Var5 != null) {
                    b2Var5.d();
                }
                if (v5.h(s22.getText(), z12, c10)) {
                    v5.n(s22.getText(), z12, c10);
                    s22.invalidateEffects();
                    d4(i13);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(z12, c10);
                s22.makeSelectedDate();
            }
        } else if (G3()) {
            int i14 = d3Var.f24607u0;
            d1 j42 = j4(i14);
            if (j42 != null && (z11 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length2 = j42.length()), 0)) < (c6 = th.c(d3Var.f24609w0, d3Var.f24612z0, length2, 0))) {
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (v5.h(j42.getText(), z11, c6)) {
                    v5.n(j42.getText(), z11, c6);
                    j42.invalidateEffects();
                    f4(i14);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(z11, c6);
                j42.makeSelectedDate();
            }
        } else {
            t5 G4 = G4();
            if (G4 == null || (z10 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length = G4.getEditText().length()), 0)) >= (c3 = th.c(d3Var.f24609w0, d3Var.f24612z0, length, 0))) {
                return;
            }
            b2 b2Var9 = this.F3;
            if (b2Var9 != null) {
                b2Var9.d();
            }
            if (v5.h(G4.getEditText().getText(), z10, c3)) {
                v5.n(G4.getEditText().getText(), z10, c3);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var10 = this.F3;
                if (b2Var10 != null) {
                    b2Var10.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(z10, c3);
            G4.getEditText().makeSelectedDate();
        }
    }

    public final a X4() {
        d3 d3Var;
        int i10;
        a Q2 = Q2();
        if (Q2 == null && (d3Var = this.f48650j3) != null && d3Var.y() && (i10 = d3Var.f24607u0) == d3Var.f24610x0) {
            return y4(i10);
        }
        return Q2;
    }

    public final boolean Y1(int i10, int i11) {
        d3 d3Var;
        ArrayList arrayList = this.J3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.J3.get(O3[0]);
            if (O3[0] != O32[0] && max != max2) {
                View z12 = z1(aVar);
                View z13 = z1(this.J3.get(O32[0]));
                if ((z12 instanceof t5) && (z13 instanceof t5)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f48646h3;
                        int size = arrayList2.size();
                        d3Var = this.f48650j3;
                        if (i12 >= size) {
                            break;
                        }
                        d3Var.Y(i12, t5.z(((a) arrayList2.get(i12)).f48328b));
                        i12++;
                    }
                    t5 t5Var = (t5) z12;
                    int length = t5Var.getEditText().length();
                    if (O3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!d3Var.k0(t5Var, 0, O3[1], length)) {
                        t5Var.B();
                        return true;
                    }
                    d3Var.c0(0, O32[1], (t5) z13);
                    return true;
                }
            } else {
                View z14 = z1(aVar);
                if (z14 instanceof t5) {
                    t5 t5Var2 = (t5) z14;
                    t5Var2.B();
                    d1 editText = t5Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(O3[1], length2), Math.min(O32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Y2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f48646h3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f48333i;
            ArrayList arrayList3 = aVar.f48335k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l10 = (Long) arrayList3.get(i12);
                long longValue = l10.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f48335k.size() <= i12 || ((Long) aVar2.f48335k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i15, i16, i12 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f48648i3.get(l10);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Y2.size() == 1 && (Y2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (Y2.get(0).text != null) {
                            textempty = Y2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Y2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f48328b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i15);
                pageblockdetails.blocks = Y2(i15 + 1, Math.min(P3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = P3 + 1;
            } else {
                int i17 = aVar.f48329c;
                if (i17 <= 0) {
                    J2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock k22 = k2(i15, i17, i13, i14, z11, iArr);
                    if (k22 != null) {
                        arrayList.add(k22);
                    }
                    int i18 = iArr[0];
                    if (i18 <= 0) {
                        i15 = i13;
                    } else {
                        i15 = i18;
                    }
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) j7.l1.i(1, arrayList))) {
                a4.w.t(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i10) {
        int i11;
        b2 b2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int z11;
        int c3;
        boolean z12;
        int i16;
        int length2;
        int z13;
        int c6;
        boolean z14;
        int i17;
        int length3;
        int z15;
        int c10;
        boolean z16;
        int i18;
        b2 b2Var2;
        int i19;
        int i20;
        int i21;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            boolean L3 = L3();
            n3 n3Var = this.f48638d3;
            int i22 = 0;
            if (L3) {
                int i23 = d3Var.f24607u0;
                int i24 = d3Var.f24608v0;
                int i25 = d3Var.f24611y0;
                int i26 = d3Var.f24609w0;
                int i27 = d3Var.f24612z0;
                boolean K3 = K3(i10, i23, i24, i26, i25, i27);
                if (!K3) {
                    i18 = w2(i10);
                } else {
                    i18 = 0;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                this.E3 = true;
                int i28 = i24;
                boolean z17 = false;
                while (i28 <= i25) {
                    d1 N4 = N4(i23, i28);
                    if (N4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = N4.length();
                        if (i28 == i24) {
                            i19 = i26;
                        } else {
                            i19 = 0;
                        }
                        if (i28 == i25) {
                            i20 = i27;
                        } else {
                            i20 = length4;
                        }
                        if (i24 == i25) {
                            i19 = Math.min(i26, i27);
                            i20 = Math.max(i26, i27);
                        }
                        int i29 = i19;
                        i21 = i24;
                        int max = Math.max(0, Math.min(i29, length4));
                        int max2 = Math.max(0, Math.min(i20, length4));
                        if (max < max2) {
                            if (!K3) {
                                if (i18 != 0) {
                                    N4.removeStyle(i18, max, max2);
                                }
                                N4.addStyle(i10, max, max2);
                            } else {
                                N4.removeStyle(i10, max, max2);
                            }
                            N4.invalidateEffects();
                            N4.requestLayout();
                            g4(i23, i28);
                            z17 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.E3 = false;
                if (z17 && (b2Var2 = this.F3) != null) {
                    b2Var2.h();
                }
                n3Var.b0();
                if (z17) {
                    o4();
                }
            } else if (y3()) {
                int i30 = d3Var.f24607u0;
                d1 I2 = I2(i30);
                if (I2 != null && (z15 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length3 = I2.length()), 0)) < (c10 = th.c(d3Var.f24609w0, d3Var.f24612z0, length3, 0))) {
                    if ((I2.getCurrentStyle(z15, c10) & i10) == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.d();
                    }
                    this.E3 = true;
                    if (z16) {
                        int w22 = w2(i10);
                        if (w22 != 0) {
                            I2.removeStyle(w22, z15, c10);
                        }
                        I2.addStyle(i10, z15, c10);
                    } else {
                        I2.removeStyle(i10, z15, c10);
                    }
                    this.E3 = false;
                    e4(i30);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    n3Var.b0();
                    o4();
                }
            } else if (w3()) {
                int i31 = d3Var.f24607u0;
                d1 s22 = s2(i31);
                if (s22 != null && (z13 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length2 = s22.length()), 0)) < (c6 = th.c(d3Var.f24609w0, d3Var.f24612z0, length2, 0))) {
                    if ((s22.getCurrentStyle(z13, c6) & i10) == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i17 = w2(i10);
                    } else {
                        i17 = 0;
                    }
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.d();
                    }
                    this.E3 = true;
                    if (z14) {
                        if (i17 != 0) {
                            s22.removeStyle(i17, z13, c6);
                        }
                        s22.addStyle(i10, z13, c6);
                    } else {
                        s22.removeStyle(i10, z13, c6);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i31);
                    this.E3 = false;
                    b2 b2Var7 = this.F3;
                    if (b2Var7 != null) {
                        b2Var7.h();
                    }
                    n3Var.b0();
                    o4();
                }
            } else if (G3()) {
                int i32 = d3Var.f24607u0;
                d1 j42 = j4(i32);
                if (j42 != null && (z11 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length = j42.length()), 0)) < (c3 = th.c(d3Var.f24609w0, d3Var.f24612z0, length, 0))) {
                    if ((j42.getCurrentStyle(z11, c3) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = w2(i10);
                    } else {
                        i16 = 0;
                    }
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.d();
                    }
                    this.E3 = true;
                    if (z12) {
                        if (i16 != 0) {
                            j42.removeStyle(i16, z11, c3);
                        }
                        j42.addStyle(i10, z11, c3);
                    } else {
                        j42.removeStyle(i10, z11, c3);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i32);
                    this.E3 = false;
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.h();
                    }
                    n3Var.b0();
                    o4();
                }
            } else {
                int i33 = d3Var.f24607u0;
                int i34 = d3Var.f24610x0;
                int i35 = d3Var.f24609w0;
                int i36 = d3Var.f24612z0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f48655l4.size()) {
                    int i37 = i10;
                    boolean J3 = J3(i37, i33, i35, i34, i36);
                    boolean z18 = !J3;
                    if (!J3) {
                        i11 = w2(i37);
                    } else {
                        i11 = 0;
                    }
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.d();
                    }
                    this.E3 = true;
                    int i38 = i33;
                    boolean z19 = false;
                    while (i38 <= i34) {
                        a y42 = y4(i38);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.f48328b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = 0;
                                }
                                z10 = z19;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = i210;
                                }
                                int max3 = Math.max(i22, Math.min(i13, i210));
                                int max4 = Math.max(i22, Math.min(i14, i210));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z19 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    t5 u22 = u2(i38);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.u4 styleDelegate = u22.getStyleDelegate();
                                        if (!J3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        u22.getEditText().invalidateEffects();
                                        u22.getEditText().requestLayout();
                                        u22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(t5.A(y42.f48328b));
                                        if (!J3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            v5.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        v5.o(spannableStringBuilder, i15, max4, i37, z18, null);
                                        t5.d(y42.f48328b, spannableStringBuilder);
                                    }
                                    z19 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z10 = z19;
                        z19 = z10;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z20 = z19;
                    this.E3 = false;
                    if (z20 && (b2Var = this.F3) != null) {
                        b2Var.h();
                    }
                    n3Var.b0();
                    if (z20) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f9, float f10) {
        TL_iv.pageTableCell m10;
        g5 g5Var = this.f48641e4;
        if (this.f48669x3 && g5Var != null && this.f48665t3 == g5Var && (m10 = g5Var.m((int) ((f9 - g5Var.getLeft()) - getLeft()), (int) ((f10 - g5Var.getTop()) - getTop()))) != null && m10 != this.A3) {
            this.A3 = m10;
            g5Var.w(this.f48671z3, m10);
        }
    }

    public final ArrayList Z2() {
        return Y2(0, this.f48646h3.size(), 0, false);
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.Z3(android.view.View):void");
    }

    public final void Z4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    t5 u22 = u2(this.f48646h3.indexOf(aVar));
                    if (u22 != null && (aVar2 = u22.f48785x) != null) {
                        u22.I(aVar2.f48328b, true);
                        u22.D = null;
                        u22.C();
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
            }
        }
    }

    public final void a2() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.f48646h3;
            if (i11 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i11);
                ArrayList arrayList7 = aVar.f48334j;
                ArrayList arrayList8 = aVar.f48335k;
                arrayList7.clear();
                if (aVar.f48333i) {
                    if (!arrayList.isEmpty()) {
                        a4.w.t(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                        ((Long) arrayList8.get(i12)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        arrayList7.add((m0) arrayList.get(i13));
                    }
                    int max = Math.max(i10, aVar.f48329c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        for (int i14 = 1; i14 <= max; i14++) {
                            int i15 = i14 - 1;
                            if (i14 == max) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i15 < arrayList2.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 && z11) {
                                if (((Boolean) arrayList3.get(i15)).booleanValue() != z10) {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                while (arrayList2.size() > i15) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(m0.a()));
                                if (z11) {
                                    z14 = z10;
                                } else {
                                    z14 = false;
                                }
                                arrayList3.add(Boolean.valueOf(z14));
                                arrayList4.add(0);
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i15)).getClass();
                            if (z11) {
                                if (((Long) arrayList5.get(i15)).longValue() != 0 && E3(aVar.f48328b)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                    arrayList5.set(i15, Long.valueOf(aVar.f48327a));
                                } else {
                                    ((Integer) arrayList4.get(i15)).getClass();
                                    ((Long) arrayList5.get(i15)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i15)).getClass();
                                arrayList7.add(new Object());
                            }
                        }
                    }
                    if (x3(aVar)) {
                        boolean z15 = ((TL_iv.pageBlockDetails) aVar.f48328b).open;
                        m0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (t5.p(aVar.f48328b)) {
                        m0.a();
                        arrayList7.add(new Object());
                    }
                }
                i11++;
                i10 = 0;
            } else {
                return;
            }
        }
    }

    public final boolean a3() {
        a aVar;
        ArrayList arrayList = this.f48646h3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) j7.l1.i(1, arrayList);
        }
        if (aVar != null && !E3(aVar.f48328b) && !aVar.f48333i && !x3(aVar) && !K2(aVar.f48328b)) {
            if (!(z1(aVar) instanceof t5)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int z10;
        int c3;
        int length2;
        int z11;
        int c6;
        int length3;
        int z12;
        int c10;
        int length4;
        int z13;
        int c11;
        d1 N4;
        int length5;
        int z14;
        int c12;
        boolean L3 = L3();
        n3 n3Var = this.f48638d3;
        d3 d3Var = this.f48650j3;
        if (L3) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24608v0;
            if (i11 == d3Var.f24611y0 && (N4 = N4(i10, i11)) != null && (z14 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length5 = N4.length()), 0)) < (c12 = th.c(d3Var.f24609w0, d3Var.f24612z0, length5, 0))) {
                if (v5.h(N4.getText(), z14, c12)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    v5.n(N4.getText(), z14, c12);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    n3Var.b0();
                    o4();
                    return;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (v5.g(N4.getText(), z14, c12)) {
                    v5.m(N4.getText(), z14, c12);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(z14, c12);
                o3(false);
                E4(N4);
            }
        } else if (y3()) {
            int i12 = d3Var.f24607u0;
            d1 I2 = I2(i12);
            if (I2 != null && (z13 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length4 = I2.length()), 0)) < (c11 = th.c(d3Var.f24609w0, d3Var.f24612z0, length4, 0))) {
                if (v5.h(I2.getText(), z13, c11)) {
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.d();
                    }
                    v5.n(I2.getText(), z13, c11);
                    I2.invalidateEffects();
                    e4(i12);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    n3Var.b0();
                    o4();
                    return;
                }
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (v5.g(I2.getText(), z13, c11)) {
                    v5.m(I2.getText(), z13, c11);
                    I2.invalidateEffects();
                    e4(i12);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(z13, c11);
                o3(false);
                E4(I2);
            }
        } else if (w3()) {
            int i13 = d3Var.f24607u0;
            d1 s22 = s2(i13);
            if (s22 != null && (z12 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length3 = s22.length()), 0)) < (c10 = th.c(d3Var.f24609w0, d3Var.f24612z0, length3, 0))) {
                if (v5.h(s22.getText(), z12, c10)) {
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.d();
                    }
                    v5.n(s22.getText(), z12, c10);
                    s22.invalidateEffects();
                    d4(i13);
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.h();
                    }
                    n3Var.b0();
                    o4();
                    return;
                }
                b2 b2Var11 = this.F3;
                if (b2Var11 != null) {
                    b2Var11.d();
                }
                if (v5.g(s22.getText(), z12, c10)) {
                    v5.m(s22.getText(), z12, c10);
                    s22.invalidateEffects();
                    d4(i13);
                    b2 b2Var12 = this.F3;
                    if (b2Var12 != null) {
                        b2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(z12, c10);
                o3(false);
                E4(s22);
            }
        } else if (G3()) {
            int i14 = d3Var.f24607u0;
            d1 j42 = j4(i14);
            if (j42 != null && (z11 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length2 = j42.length()), 0)) < (c6 = th.c(d3Var.f24609w0, d3Var.f24612z0, length2, 0))) {
                if (v5.h(j42.getText(), z11, c6)) {
                    b2 b2Var13 = this.F3;
                    if (b2Var13 != null) {
                        b2Var13.d();
                    }
                    v5.n(j42.getText(), z11, c6);
                    j42.invalidateEffects();
                    f4(i14);
                    b2 b2Var14 = this.F3;
                    if (b2Var14 != null) {
                        b2Var14.h();
                    }
                    n3Var.b0();
                    o4();
                    return;
                }
                b2 b2Var15 = this.F3;
                if (b2Var15 != null) {
                    b2Var15.d();
                }
                if (v5.g(j42.getText(), z11, c6)) {
                    v5.m(j42.getText(), z11, c6);
                    j42.invalidateEffects();
                    f4(i14);
                    b2 b2Var16 = this.F3;
                    if (b2Var16 != null) {
                        b2Var16.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(z11, c6);
                o3(false);
                E4(j42);
            }
        } else {
            t5 G4 = G4();
            if (G4 == null || (z10 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length = G4.getEditText().length()), 0)) >= (c3 = th.c(d3Var.f24609w0, d3Var.f24612z0, length, 0))) {
                return;
            }
            if (v5.h(G4.getEditText().getText(), z10, c3)) {
                b2 b2Var17 = this.F3;
                if (b2Var17 != null) {
                    b2Var17.d();
                }
                v5.n(G4.getEditText().getText(), z10, c3);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var18 = this.F3;
                if (b2Var18 != null) {
                    b2Var18.h();
                }
                n3Var.b0();
                o4();
                return;
            }
            b2 b2Var19 = this.F3;
            if (b2Var19 != null) {
                b2Var19.d();
            }
            if (v5.g(G4.getEditText().getText(), z10, c3)) {
                v5.m(G4.getEditText().getText(), z10, c3);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var20 = this.F3;
                if (b2Var20 != null) {
                    b2Var20.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(z10, c3);
            o3(false);
            E4(G4.getEditText());
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            s sVar = new s();
            aVar.f48332g = sVar;
            sVar.f48714c = true;
            long j10 = document.f22398id;
            z10 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                s sVar2 = aVar.f48332g;
                sVar2.f48718i = document;
                sVar2.f48715e = str;
                sVar2.f48712a = 1;
                sVar2.f48716f = 0.0f;
            } else {
                sVar.h = document;
                sVar.f48718i = document;
                sVar.f48712a = 2;
                pageblockaudio.audio_id = j10;
            }
            u3(aVar);
            if (z10) {
                s sVar3 = aVar.f48332g;
                String str2 = sVar3.f48715e;
                IdentityHashMap identityHashMap = this.V3;
                s4 s4Var = (s4) identityHashMap.remove(sVar3);
                if (s4Var != null) {
                    s4Var.b();
                }
                s4 s4Var2 = new s4(this.f48635b3, str2, document, new a3(aVar, sVar3, this));
                identityHashMap.put(sVar3, s4Var2);
                s4Var2.d();
            }
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            this.f48638d3.onContentChanged();
        }
    }

    public final void b3(a aVar, boolean z10) {
        int i10;
        View z12 = z1(aVar);
        if (z12 instanceof y4) {
            d1 d1Var = ((y4) z12).f48907r;
            d1Var.r();
            if (z10) {
                i10 = d1Var.length();
            } else {
                i10 = 0;
            }
            d1Var.setSelection(i10);
            return;
        }
        c3(aVar, z10);
    }

    public final void b4() {
        d1 editText;
        Runnable e2Var;
        int length;
        final int z10;
        final int c3;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            if (L3()) {
                int i10 = d3Var.f24607u0;
                int i11 = d3Var.f24608v0;
                if (i11 == d3Var.f24611y0) {
                    editText = N4(i10, i11);
                    e2Var = new j2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (y3()) {
                int i12 = d3Var.f24607u0;
                editText = I2(i12);
                e2Var = new d2(this, i12, 3);
            } else if (w3()) {
                int i13 = d3Var.f24607u0;
                editText = s2(i13);
                e2Var = new d2(this, i13, 0);
            } else if (G3()) {
                int i14 = d3Var.f24607u0;
                editText = j4(i14);
                e2Var = new d2(this, i14, 1);
            } else {
                t5 G4 = G4();
                if (G4 != null) {
                    editText = G4.getEditText();
                    e2Var = new e2(G4, 0);
                } else {
                    return;
                }
            }
            final d1 d1Var = editText;
            final Runnable runnable = e2Var;
            if (d1Var != null && (z10 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length = d1Var.length()), 0)) <= (c3 = th.c(d3Var.f24609w0, d3Var.f24612z0, length, 0))) {
                Editable text = d1Var.getText();
                int i15 = r.h;
                String str = null;
                if (text != null) {
                    r[] rVarArr = (r[]) text.getSpans(z10, c3, r.class);
                    if (rVarArr.length > 0) {
                        str = rVarArr[0].f48696a;
                    }
                }
                if (str == null) {
                    str = d1Var.getText().subSequence(z10, c3).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = g6.G6;
                c6 c6Var = this.c3;
                final int v02 = g6.v0(i16, c6Var);
                p.U(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        r a2;
                        String str2 = (String) obj;
                        p3 p3Var = p3.this;
                        p3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = r.a(str2, v02, dp)) == null) {
                            return;
                        }
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        d3 d3Var2 = p3Var.f48650j3;
                        if (d3Var2 != null) {
                            d3Var2.f(false);
                        }
                        d1 d1Var2 = d1Var;
                        d1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = d1Var2.getText();
                        int max = Math.max(0, Math.min(z10, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(c3, text2.length())), spannableString);
                        runnable.run();
                        b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.f48638d3.onContentChanged();
                        int min = Math.min(max + 1, d1Var2.length());
                        d1Var2.r();
                        p3Var.post(new p2(d1Var2, min, 3));
                    }
                }, c6Var);
            }
        }
    }

    public final void b5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.b5(java.lang.CharSequence):void");
    }

    public final void c2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f22398id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "application/octet-stream";
            }
            tL_document.mime_type = str2;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (z12 instanceof g5) {
            g5 g5Var = (g5) z12;
            d1 d1Var = g5Var.f48464r;
            x5 x5Var = g5Var.B;
            if (x5Var != null) {
                if (!z10) {
                    d1Var.r();
                    d1Var.setSelection(0);
                    return;
                } else if (!x5Var.f48891g.isEmpty()) {
                    j5 m10 = g5Var.v.m((TL_iv.pageTableCell) j7.l1.i(1, g5Var.B.f48891g));
                    if (m10 != null) {
                        d1 d1Var2 = m10.f48526a;
                        d1Var2.r();
                        d1Var2.setSelection(d1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (z12 instanceof t5)) {
            t5 t5Var = (t5) z12;
            if (t5Var.n()) {
                t5Var.i();
                return;
            }
        }
        d1 R3 = R3(z12);
        if (R3 == null) {
            d3(aVar);
            return;
        }
        R3.r();
        if (z10) {
            R3.setSelection(R3.length());
        }
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.c4():void");
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            s sVar = new s();
            aVar.f48332g = sVar;
            sVar.d = true;
            long j10 = document.f22398id;
            z10 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                if (!TextUtils.isEmpty(str) && com.google.android.recaptcha.internal.a.v(str)) {
                    s sVar2 = aVar.f48332g;
                    sVar2.h = document;
                    sVar2.f48715e = str;
                    sVar2.f48712a = 1;
                    sVar2.f48716f = 0.0f;
                } else {
                    return;
                }
            } else {
                sVar.h = document;
                sVar.f48712a = 2;
                pageblockdocument.document_id = j10;
            }
            u3(aVar);
            if (z10) {
                s sVar3 = aVar.f48332g;
                IdentityHashMap identityHashMap = this.V3;
                s4 s4Var = (s4) identityHashMap.remove(sVar3);
                if (s4Var != null) {
                    s4Var.b();
                }
                s4 s4Var2 = new s4(this.f48635b3, str, document, new z2(this, sVar3, aVar, str));
                identityHashMap.put(sVar3, s4Var2);
                s4Var2.d();
            }
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            this.f48638d3.onContentChanged();
        }
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof t5) {
            ((t5) z12).B();
        } else if (z12 instanceof q0) {
            ((q0) z12).d.r();
        }
    }

    public final void d4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof i0) {
            ((i0) A4).b();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i11;
        int i12;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f9;
        boolean z10;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f48655l4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                if (R >= 0 && R < arrayList.size()) {
                    aVar4 = (a) arrayList.get(R);
                } else {
                    aVar4 = null;
                }
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.f48335k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f48657m4 == null) {
                    ql0 ql0Var = new ql0(this);
                    this.f48657m4 = ql0Var;
                    ql0Var.a(null, null, null, this.c3, 1);
                    x7.a(this.f48657m4, this.c3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j10 = 0;
                    float f11 = 0.0f;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f12 = 1.0f;
                    while (i16 <= childCount) {
                        if (i16 < childCount) {
                            View childAt = getChildAt(i16);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f48335k;
                                if (i15 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i15);
                                    i10 = childCount;
                                    view = childAt;
                                }
                            }
                            i10 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i10 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f9 = f12;
                        } else {
                            int k42 = k4(i15, aVar5, true);
                            l11 = l10;
                            int k43 = k4(i15, aVar6, false);
                            if (f11 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.x3.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f10, B, f11 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f48657m4.b(canvas, rectF, floor, floor, floor, f12);
                                    f9 = f12;
                                    this.f48657m4.e(canvas, rectF, f9);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f9 = f12;
                            z11 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z11) {
                                j10 = l11.longValue();
                                f10 = Float.MAX_VALUE;
                                f11 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f9 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.O3) {
                                z11 = z10;
                            } else {
                                float y8 = view.getY();
                                float height = view.getHeight() + y8;
                                if (y8 < f10) {
                                    f10 = y8;
                                }
                                if (height > f11) {
                                    f11 = height;
                                }
                                f12 = Math.min(f9, view.getAlpha());
                                z11 = z10;
                                i16++;
                                aVar6 = aVar;
                                childCount = i10;
                                i15 = i11;
                                i14 = i12;
                                arrayList = arrayList2;
                            }
                        } else {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        }
                        f12 = f9;
                        i16++;
                        aVar6 = aVar;
                        childCount = i10;
                        i15 = i11;
                        i14 = i12;
                        arrayList = arrayList2;
                    }
                    i15++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.X3;
            String str = null;
            this.X3 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i10 = this.f48659n4;
            this.f48659n4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.r1(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof t5) {
            t5 t5Var = (t5) z12;
            t5Var.B();
            d1 editText = t5Var.getEditText();
            editText.setSelection(editText.length());
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            d1 editText2 = q0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i10) {
        a y42 = y4(i10);
        d1 I2 = I2(i10);
        if (x3(y42) && I2 != null) {
            ((TL_iv.pageBlockDetails) y42.f48328b).title = v5.f(I2.getText());
        }
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        p3 p3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        boolean c3 = o4.c(photoEntry);
        if (!photoEntry.isVideo && !c3) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f48332g = T3(photoEntry, str2);
        u3(aVar);
        if (c3) {
            K4(aVar, aVar.f48332g, photoEntry);
            p3Var = this;
        } else {
            p3Var = this;
            p3Var.L4(aVar, aVar.f48332g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.f48638d3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof t5) {
            t5 t5Var = (t5) z12;
            t5Var.B();
            t5Var.getEditText().setSelection(0);
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            q0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof t5) {
            ((t5) A4).w();
        }
    }

    public final void g2(g5 g5Var) {
        g5 g5Var2 = this.f48641e4;
        if (g5Var2 != null && g5Var2 != g5Var) {
            LinkedHashSet linkedHashSet = g5Var2.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                g5Var2.v.invalidate();
                g5Var2.t();
            }
        }
        this.f48641e4 = g5Var;
        this.f48670y3 = false;
        this.f48647h4 = -1;
        this.f48645g4 = -1;
        g5Var.setCellSelectionListener(this.f48649i4);
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y()) {
            d3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i10, int i11) {
        j5 m10;
        View A4 = A4(i10);
        if (A4 instanceof g5) {
            g5 g5Var = (g5) A4;
            if (i11 == 0) {
                g5Var.u();
                return;
            }
            TL_iv.pageTableCell h = g5Var.h(i11);
            if (h != null && (m10 = g5Var.getGrid().m(h)) != null) {
                x5.d(h, m10.f48526a.getText());
            }
        }
    }

    public d1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        return null;
    }

    public e4 getMapDelegate() {
        return this.Z3;
    }

    public View getOverlayView() {
        return this.f48652k3;
    }

    public k9 getTextSelectionHelper() {
        return this.f48650j3;
    }

    public final g3 h2() {
        int i10;
        int i11;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y() && !G3()) {
            a y42 = y4(d3Var.f24607u0);
            ArrayList arrayList = this.f48646h3;
            int indexOf = arrayList.indexOf(y42);
            int indexOf2 = arrayList.indexOf(y4(d3Var.f24610x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i11 = indexOf;
                    i10 = indexOf2;
                } else {
                    i10 = indexOf;
                    i11 = indexOf2;
                }
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    if (aVar.f48333i || x3(aVar)) {
                        return null;
                    }
                }
                return new g3(this, i10, i11, d3Var.f24609w0, d3Var.f24612z0);
            }
            return null;
        }
        return null;
    }

    public final boolean h3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.h3(android.view.KeyEvent):boolean");
    }

    public final int i2(int i10) {
        d1 I2 = I2(i10);
        if (I2 != null) {
            return I2.length();
        }
        t5 u22 = u2(i10);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i10);
        if (y42 == null) {
            return 0;
        }
        return t5.z(y42.f48328b).length();
    }

    public final boolean i3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.i3(android.view.MotionEvent):boolean");
    }

    public final int i4(int i10) {
        Layout layout;
        View A4 = A4(i10);
        if (!(A4 instanceof t5) || (layout = ((t5) A4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (k3()) {
            ArrayList<TL_iv.PageBlock> Z2 = Z2();
            if (Z2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2();
            richMessage.documents = y2();
            return richMessage;
        }
        return null;
    }

    public final boolean j3(th.g5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.j3(th.g5, int, int):boolean");
    }

    public final d1 j4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof t5) {
            return ((t5) A4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock k2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.k2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean k3() {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.k3():boolean");
    }

    public final boolean l2() {
        d1 editText;
        int length;
        int z10;
        int c3;
        c4[] c4VarArr;
        d3 d3Var = this.f48650j3;
        if (d3Var == null || !d3Var.y() || d3Var.f24607u0 != d3Var.f24610x0) {
            return false;
        }
        if (L3()) {
            int i10 = d3Var.f24607u0;
            int i11 = d3Var.f24608v0;
            if (i11 != d3Var.f24611y0) {
                return false;
            }
            editText = N4(i10, i11);
        } else if (y3()) {
            editText = I2(d3Var.f24607u0);
        } else if (w3()) {
            editText = s2(d3Var.f24607u0);
        } else if (G3()) {
            editText = j4(d3Var.f24607u0);
        } else {
            t5 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (z10 = th.z(d3Var.f24609w0, d3Var.f24612z0, (length = editText.length()), 0)) >= (c3 = th.c(d3Var.f24609w0, d3Var.f24612z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && z10 < c3) {
            for (c4 c4Var : (c4[]) text.getSpans(z10, c3, c4.class)) {
                if (text.getSpanStart(c4Var) < c3 && text.getSpanEnd(c4Var) > z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] D4 = D4();
        if (D4 == null) {
            return n2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (n2((a) this.f48646h3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48646h3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (s sVar : Q3((a) arrayList.get(i10))) {
                if (sVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean m4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f48646h3;
            if (i11 < arrayList.size()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (q3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f48329c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f48329c < aVar.f48329c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (q3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof d1) {
                        X1();
                    } else {
                        this.U2.N(false);
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f48646h3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f48329c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f48328b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f48329c < aVar2.f48329c) {
                return false;
            }
            if (p3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                t5Var.f48780f.hideActionMode();
                t5Var.h.hideActionMode();
            } else if (childAt instanceof g5) {
                g5 g5Var = (g5) childAt;
                i5 i5Var = g5Var.v;
                g5Var.f48464r.hideActionMode();
                for (int i11 = 0; i11 < i5Var.getChildCount(); i11++) {
                    View childAt2 = i5Var.getChildAt(i11);
                    if (childAt2 instanceof j5) {
                        ((j5) childAt2).f48526a.hideActionMode();
                    }
                }
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof m4) {
            m4 m4Var = (m4) z12;
            ArrayList arrayList = m4Var.f48584y;
            if (m4Var.f48892a != null) {
                m4Var.n();
                if (m4Var.S >= arrayList.size()) {
                    m4Var.S = Math.max(0, arrayList.size() - 1);
                }
                m4Var.o(false);
                m4Var.requestLayout();
                m4Var.invalidate();
            }
        }
    }

    public final boolean o2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f48646h3;
            if (i10 < arrayList.size() && E3(((a) arrayList.get(i10)).f48328b) && ((a) arrayList.get(i10 - 1)).f48329c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3(boolean z10) {
        d3 d3Var = this.f48650j3;
        if (d3Var != null) {
            if (z10) {
                d3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(d3Var.f25964r0);
                d3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.I3);
        this.W2 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.G3;
        if (i15 > 0 && i14 < i15) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new d2(this, dp, 2));
                }
            }
        }
        this.G3 = i14;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (q2((a) this.f48646h3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i10) {
        if (((a) this.f48646h3.get(i10)).f48329c + 1 <= MessagesController.getInstance(this.f48635b3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void p4(int i10) {
        ArrayList arrayList = this.f48646h3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f48329c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof t5) {
                    ((t5) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f48646h3).indexOf(aVar)) < 0 || aVar.f48329c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f48329c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f48646h3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f48329c > 0) {
                        t2(i10);
                        return true;
                    }
                } else if (aVar2.f48329c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f48328b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || o2(i10)) && p3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f48329c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f48329c = aVar.f48329c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.f48330e = false;
                        aVar2.f48331f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f48329c >= aVar2.f48329c)) && p3(i10)) {
                    aVar2.f48329c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, s sVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (B3(aVar.f48328b)) {
            ArrayList g32 = g3(aVar.f48328b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(sVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (g32 != null && i10 < g32.size()) {
                    g32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                r4(aVar);
                return;
            }
            int size = aVar.h.size();
            k51 k51Var = this.U2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f48328b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
                aVar.f48328b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f48332g = (s) aVar.h.get(0);
                aVar.h = null;
                k51Var.N(true);
                n4(aVar);
                return;
            }
            k51Var.N(true);
            n4(aVar);
            return;
        }
        r4(aVar);
    }

    public final boolean r2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            if (b2Var.f48365e || !b2Var.f48363b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] D4 = D4();
        if (D4 != null && (i10 = D4[0]) != (i11 = D4[1])) {
            m4(i10, i11, z10);
            return;
        }
        if (D4 == null) {
            aVar = D2();
        } else {
            aVar = (a) this.f48646h3.get(D4[0]);
        }
        if (aVar != null) {
            W3(aVar, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.f48646h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.U2.N(true);
        }
    }

    public final d1 s2(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof i0) {
            return ((i0) A4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f48335k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l10 = (Long) arrayList3.get(i11);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f48648i3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f48344t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f48335k.add((Long) arrayList3.get(i12));
                }
                int i13 = x4.f48885a;
                w41 J = w41.J(x4.class);
                J.G = aVar2;
                J.H = this.f48636b4;
                arrayList2.add(J);
                this.f48655l4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48646h3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f48329c > 0 && aVar.d > 0 && !E3(aVar.f48328b)) {
                    int i11 = aVar.f48329c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f48329c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !E3(aVar2.f48328b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                    aVar.d = i12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f48642f3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.N3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f48640e3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.J3 = new ArrayList();
        ArrayList arrayList = this.f48646h3;
        W2(arrayList, u4.b(charSequence), this.f48648i3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.J3.add((a) arrayList.get(size));
        }
        this.U2.N(false);
    }

    public final void t2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f48646h3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f48329c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f48329c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.f48330e = false;
                aVar2.f48331f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f48329c) > i12) {
                    aVar.f48329c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void t3() {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.t3():void");
    }

    public final void t4(String str) {
        d3 d3Var = this.f48650j3;
        W1(d3Var.f24607u0, d3Var.f24609w0, d3Var.f24610x0, d3Var.f24612z0, str.split("\n", -1));
    }

    public final t5 u2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.T2.m(i10);
        if (!(m10 instanceof t5)) {
            return null;
        }
        return (t5) m10;
    }

    public final void u3(th.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: th.p3.u3(th.a):void");
    }

    public final s u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document S2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (S2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.f48714c = true;
            sVar.f48712a = 2;
            sVar.h = S2;
            sVar.f48718i = S2;
            return sVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f48712a = 2;
            sVar2.h = S22;
            return sVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document S23 = S2(pageblockvideo.video_id);
                if (S23 == null) {
                    return null;
                }
                s sVar3 = new s();
                sVar3.f48713b = true;
                sVar3.f48712a = 2;
                sVar3.h = S23;
                sVar3.f48723n = pageblockvideo.spoiler;
                while (i10 < S23.attributes.size()) {
                    if (S23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i10);
                        sVar3.f48719j = tL_documentAttributeVideo.f22399w;
                        sVar3.f48720k = tL_documentAttributeVideo.h;
                        return sVar3;
                    }
                    i10++;
                }
                return sVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 == 0) {
                    photo = null;
                } else {
                    int i12 = 0;
                    loop1: while (true) {
                        if (i12 < this.f48646h3.size()) {
                            for (s sVar4 : Q3((a) this.f48646h3.get(i12))) {
                                if (sVar4 != null && (photo = sVar4.f48717g) != null && photo.f22416id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f48644g3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f22416id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = n4.f48593a;
                            synchronized (n4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) n4.f48593a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                s sVar5 = new s();
                sVar5.f48712a = 2;
                sVar5.f48717g = photo;
                sVar5.f48723n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    sVar5.f48719j = closestPhotoSizeWithSize.f22417w;
                    sVar5.f48720k = closestPhotoSizeWithSize.h;
                }
                return sVar5;
            }
        }
    }

    public final void v2() {
        G2();
        this.f48644g3 = null;
        this.X3 = null;
        this.Y3 = null;
        this.F3 = new b2(this.f48653k4);
        z4();
        this.F3.j();
        n3 n3Var = this.f48638d3;
        if (n3Var != null) {
            n3Var.s1();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f48644g3 != null && aVar != null && (pageBlock = aVar.f48328b) != null) {
            if (B3(pageBlock)) {
                ArrayList g32 = g3(aVar.f48328b);
                aVar.h = new ArrayList();
                if (g32 != null) {
                    for (int i10 = 0; i10 < g32.size(); i10++) {
                        s u42 = u4((TL_iv.PageBlock) g32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (u42 == null) {
                            u42 = new s();
                        }
                        arrayList.add(u42);
                    }
                    return;
                }
                return;
            }
            s u43 = u4(aVar.f48328b);
            if (u43 != null) {
                aVar.f48332g = u43;
            }
        }
    }

    public final boolean w3() {
        int i10;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y() && (i10 = d3Var.f24607u0) == d3Var.f24610x0 && i10 >= 0 && i10 < this.f48655l4.size()) {
            return A4(i10) instanceof i0;
        }
        return false;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (B3(aVar.f48328b)) {
                ArrayList g32 = g3(aVar.f48328b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (g32 != null) {
                    int size2 = g32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = g32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s u42 = u4(pageBlock);
                        if (u42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(u42);
                        }
                    }
                    g32.clear();
                    g32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f48328b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    s u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.f48332g = u43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f48646h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f48333i;
            ArrayList arrayList2 = aVar.f48335k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new Object());
                }
            }
            i10++;
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f48335k;
            if (arrayList3.size() == 1 && (aVar2.f48328b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f48328b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f48648i3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f48328b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void x4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d4) {
                y yVar = (y) ((d4) childAt);
                yVar.f48893b.a(yVar.f48892a, new sf.f1(yVar, 3));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f48646h3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f48328b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f48332g) != null && sVar.b() && (document2 = aVar.f48332g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f48328b).document_id = document2.f22398id;
                }
                for (s sVar2 : Q3(aVar)) {
                    if (sVar2.b() && (document = sVar2.h) != null) {
                        long j10 = document.f22398id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(sVar2.h);
                        }
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean y3() {
        int i10;
        d3 d3Var = this.f48650j3;
        if (d3Var != null && d3Var.y() && (i10 = d3Var.f24607u0) == d3Var.f24610x0 && x3(y4(i10))) {
            return true;
        }
        return false;
    }

    public final a y4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f48655l4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f48646h3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f22398id))) {
                    arrayList.add(sVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.f48646h3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.U2.N(false);
    }
}

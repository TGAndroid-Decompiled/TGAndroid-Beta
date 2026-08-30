package vh;

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
import k7.i8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.yh;
public final class r3 extends g61 {
    public static final ArrayList f46106p4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public TL_iv.pageTableCell B3;
    public long C3;
    public float D3;
    public float E3;
    public boolean F3;
    public c2 G3;
    public int H3;
    public d1 I3;
    public final h J3;
    public ArrayList K3;
    public int L3;
    public int M3;
    public int N3;
    public boolean O3;
    public a P3;
    public boolean Q3;
    public final j3 R3;
    public final m2 S3;
    public final k3 T3;
    public final l3 U3;
    public final m3 V3;
    public final IdentityHashMap W3;
    public final IdentityHashMap X3;
    public a Y3;
    public a Z3;
    public final n3 f46107a4;
    public final w2 f46108b4;
    public final int c3;
    public final x2 f46109c4;
    public final f6 f46110d3;
    public final y2 f46111d4;
    public final p3 f46112e3;
    public final z2 f46113e4;
    public MessageObject f46114f3;
    public i5 f46115f4;
    public boolean f46116g3;
    public o70 f46117g4;
    public TL_iv.RichMessage f46118h3;
    public int f46119h4;
    public final ArrayList f46120i3;
    public int f46121i4;
    public final HashMap f46122j3;
    public final n2 f46123j4;
    public final f3 f46124k3;
    public final a3 f46125k4;
    public final y9 f46126l3;
    public final ph.j5 f46127l4;
    public int f46128m3;
    public final ArrayList f46129m4;
    public int f46130n3;
    public am0 f46131n4;
    public int f46132o3;
    public int f46133o4;
    public boolean f46134p3;
    public float f46135q3;
    public float f46136r3;
    public float f46137s3;
    public float f46138t3;
    public View f46139u3;
    public b f46140v3;
    public boolean f46141w3;
    public boolean f46142x3;
    public boolean f46143y3;
    public boolean f46144z3;

    public r3(Context context, int i10, f6 f6Var, p3 p3Var) {
        super(context, i10, 0, false, new ph.d4(r1, 29), new rh.e(r1, 11), null, f6Var);
        this.f46116g3 = true;
        this.f46120i3 = new ArrayList();
        this.f46122j3 = new HashMap();
        this.f46128m3 = -1;
        this.f46130n3 = -1;
        this.f46132o3 = 0;
        this.J3 = new h(this, 2);
        this.O3 = true;
        this.R3 = new j3(this);
        this.S3 = new m2(this);
        this.T3 = new k3(this);
        this.U3 = new l3(this);
        this.V3 = new m3(this);
        this.W3 = new IdentityHashMap();
        this.X3 = new IdentityHashMap();
        this.f46107a4 = new n3(this);
        this.f46108b4 = new w2(this);
        this.f46109c4 = new x2(this);
        this.f46111d4 = new y2(this);
        this.f46113e4 = new z2(this);
        this.f46119h4 = -1;
        this.f46121i4 = -1;
        this.f46123j4 = new n2(this);
        this.f46125k4 = new a3(this);
        ph.j5 j5Var = new ph.j5(this, 15);
        this.f46127l4 = j5Var;
        this.f46129m4 = new ArrayList();
        this.f46133o4 = -1;
        r3[] r3VarArr = {this};
        this.c3 = i10;
        this.f46110d3 = f6Var;
        this.f46112e3 = p3Var;
        this.V2.f30240r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new o2(this, 0), false);
        setReorderLongPressEnabled(false);
        w1(true);
        f3 f3Var = new f3(this, p3Var);
        this.f46124k3 = f3Var;
        f3Var.T(this);
        f3Var.E0 = this.U2;
        y9 o10 = f3Var.o(context);
        this.f46126l3 = o10;
        AndroidUtilities.removeFromParent(o10);
        f3Var.D = new h3(this, p3Var);
        j(new jh.l(9, this, p3Var));
        this.G3 = new c2(j5Var);
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
        if (aVar != null && !aVar.f45779i && !x3(aVar) && (aVar.f45775b instanceof TL_iv.pageBlockParagraph) && aVar.f45776c == 0 && aVar.d == 0 && !aVar.e && aVar.f45781k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void I1(vh.r3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.w51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.I1(vh.r3[], java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    public static void J2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f45775b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f45778g;
            if (sVar != null && sVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f45775b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f45775b.caption.text = new TL_iv.textEmpty();
                        aVar.f45775b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f45775b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f45778g;
            if (sVar2 != null && sVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f45775b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f45775b.caption.text = new TL_iv.textEmpty();
                        aVar.f45775b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f45775b);
                }
            }
        } else if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.f45775b);
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
                if (aVar.f45775b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f45775b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f45775b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                h0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f45775b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                s sVar3 = aVar.f45778g;
                if (sVar3 != null && sVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f45775b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f45775b.caption.text = new TL_iv.textEmpty();
                            aVar.f45775b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f45775b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                s sVar4 = aVar.f45778g;
                if (sVar4 != null && (document = sVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f19190id;
                }
                if (sVar4 != null && sVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f45775b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        h0.d(pageBlock7);
                        arrayList.add(aVar.f45775b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = i4.J;
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
                    arrayList.add(aVar.f45775b);
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
                                    z5.c(pagetablecell, "");
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

    public static void K1(r3 r3Var, int i10, int i11, int i12) {
        d1 editText;
        if (i10 >= 0) {
            View m9 = r3Var.U2.m(i10);
            if (m9 instanceof v5) {
                v5 v5Var = (v5) m9;
                if (i11 == 1 && v5Var.n()) {
                    editText = v5Var.getAuthorEditText();
                } else {
                    editText = v5Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m9 instanceof i5) {
                i5 i5Var = (i5) m9;
                d1 l10 = i5Var.l(i11);
                if (l10 == null) {
                    l10 = i5Var.l(0);
                }
                if (l10 != null) {
                    l10.s();
                    l10.setSelection(Math.max(0, Math.min(i12, l10.length())));
                }
            } else if (m9 instanceof i0) {
                d1 captionEditText = ((i0) m9).getCaptionEditText();
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

    public static org.telegram.tgnet.tl.TL_iv.PageBlock L1(vh.r3 r2, vh.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.L1(vh.r3, vh.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
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

    public static void M1(r3 r3Var, d1 d1Var) {
        if (d1Var == null) {
            r3Var.getClass();
            return;
        }
        d1Var.adaptiveCreateLinkDialog = r3Var.f46116g3;
        d1Var.setInlineButtonContext(r3Var.c3);
        d1Var.setInlineButtonClickListener(new n2(r3Var));
    }

    public static void N1(a aVar, s sVar, r3 r3Var) {
        p3 p3Var = r3Var.f46112e3;
        IdentityHashMap identityHashMap = r3Var.X3;
        IdentityHashMap identityHashMap2 = r3Var.W3;
        if (sVar == null) {
            ArrayList arrayList = r3Var.f46120i3;
            for (s sVar2 : Q3(aVar)) {
                u4 u4Var = (u4) identityHashMap2.remove(sVar2);
                if (u4Var != null) {
                    u4Var.b();
                }
                q4 q4Var = (q4) identityHashMap.remove(sVar2);
                if (q4Var != null) {
                    q4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                c2 c2Var = r3Var.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                arrayList.remove(indexOf);
                r3Var.V2.N(true);
                c2 c2Var2 = r3Var.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
            }
            p3Var.onContentChanged();
            return;
        }
        u4 u4Var2 = (u4) identityHashMap2.remove(sVar);
        if (u4Var2 != null) {
            u4Var2.b();
        }
        q4 q4Var2 = (q4) identityHashMap.remove(sVar);
        if (q4Var2 != null) {
            q4Var2.a();
        }
        c2 c2Var3 = r3Var.G3;
        if (c2Var3 != null) {
            c2Var3.d();
        }
        r3Var.q4(aVar, sVar);
        c2 c2Var4 = r3Var.G3;
        if (c2Var4 != null) {
            c2Var4.h();
        }
        p3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z4, int i11, boolean z10, boolean z11) {
        boolean z12 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z12) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z10, z11);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.e = z10;
                            aVar.f45777f = z11;
                            arrayList.add(aVar);
                        }
                        z12 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z4 ? 1 : 0));
                    }
                } else {
                    if (!z12) {
                        S1(arrayList, null, i10, i11, z10, z11);
                        z12 = true;
                    }
                    O2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z12) {
            S1(arrayList, null, i10, i11, z10, z11);
        }
    }

    public static TL_iv.PageBlock N3(a aVar, s sVar) {
        int i10;
        if (B3(aVar.f45775b)) {
            ArrayList g32 = g3(aVar.f45775b);
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
        return aVar.f45775b;
    }

    public static void O1(r3 r3Var) {
        if (r3Var.F3) {
            return;
        }
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.h();
        }
        r3Var.f46112e3.n();
        r3Var.o4();
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
        if (richText != null && !TextUtils.isEmpty(x5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!z5.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(r3 r3Var, a aVar) {
        ArrayList arrayList = r3Var.f46120i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f45781k.addAll(aVar.f45781k);
        arrayList.add(indexOf + 1, aVar2);
        r3Var.s4();
        r3Var.V2.N(false);
        c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        r3Var.post(new j2(r3Var, aVar2, 23));
    }

    public static FrameLayout P4(i5 i5Var, boolean z4) {
        int i10;
        l5 m9;
        z5 model = i5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z4) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : i5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z4 ? (z5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z4 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m9 = i5Var.getGrid().m(pagetablecell)) != null) {
                return m9;
            }
        }
        return i5Var;
    }

    public static boolean Q1(vh.r3 r16, vh.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.Q1(vh.r3, vh.a, boolean):boolean");
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.f45775b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        s sVar = aVar.f45778g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static d1 R3(View view) {
        if (view instanceof v5) {
            return ((v5) view).getEditText();
        }
        if (view instanceof i0) {
            return ((i0) view).getCaptionEditText();
        }
        if (view instanceof q0) {
            return ((q0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z4, boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z4;
        aVar.f45777f = z10;
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
        boolean z4;
        int i10;
        s sVar = new s();
        sVar.f46151b = photoEntry.isVideo;
        sVar.e = str;
        sVar.f46156j = photoEntry.width;
        sVar.f46157k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = 0;
        } else {
            i10 = photoEntry.orientation;
        }
        sVar.f46158l = i10;
        if (!z4) {
            i11 = photoEntry.invert;
        }
        sVar.f46159m = i11;
        sVar.f46150a = 1;
        sVar.f46153f = 0.0f;
        return sVar;
    }

    public static i5 U2(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof i5) {
                return (i5) parent;
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
                        aVar.f45779i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = m0.a();
                        W2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f45781k.add(0, Long.valueOf(a2));
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

    public static int[] a5(i5 i5Var) {
        int i10;
        int i11;
        z5 z5Var = i5Var.C;
        if (z5Var != null) {
            i10 = z5Var.f46343g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            d1 l10 = i5Var.l(i10);
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

    public static boolean h4(d1 d1Var, float f10, float f11) {
        if (d1Var != null && d1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            d1Var.getLocationOnScreen(iArr);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= d1Var.getWidth() && f13 <= d1Var.getHeight()) {
                int offsetForPosition = d1Var.getOffsetForPosition(f12, f13);
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

    public static int k4(int i10, a aVar, boolean z4) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z4) {
            i11 = aVar.f45782l;
        } else {
            i11 = aVar.f45783m;
        }
        int size = aVar.f45781k.size() - i11;
        return org.telegram.messenger.y3.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !D3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f45781k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f45781k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z4) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                ((v5) childAt).setLocked(z4);
            } else if (childAt instanceof i5) {
                ((i5) childAt).setLocked(z4);
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().setLocked(z4);
            } else if (childAt instanceof q0) {
                ((q0) childAt).setLocked(z4);
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
        if (aVar != null && (aVar.f45775b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !v5.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean A1() {
        return this.Q3;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f46120i3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (photo = sVar.f46154g) != null && hashSet.add(Long.valueOf(photo.f19208id))) {
                    arrayList.add(sVar.f46154g);
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
        return this.U2.m(i10);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f46120i3;
            if (i10 < arrayList2.size()) {
                for (s sVar : Q3((a) arrayList2.get(i10))) {
                    if (sVar.b() && (photo = sVar.f46154g) != null && hashSet.add(Long.valueOf(photo.f19208id))) {
                        arrayList.add(sVar.f46154g);
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
        ArrayList arrayList = this.f46120i3;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            int indexOf = arrayList.indexOf(y4(f3Var.f21401u0));
            int indexOf2 = arrayList.indexOf(y4(f3Var.f21404x0));
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
        p3 p3Var = this.f46112e3;
        if (p3Var != null) {
            p3Var.v();
        }
    }

    public final void C2() {
        c2 c2Var = this.G3;
        if (c2Var != null) {
            c2Var.h();
        }
        ArrayList arrayList = this.f46120i3;
        SpannableStringBuilder k10 = w4.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.f46122j3;
        hashMap.clear();
        this.f46118h3 = null;
        W2(arrayList, w4.b(k10), hashMap);
        this.V2.N(false);
        c2 c2Var2 = this.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        p3 p3Var = this.f46112e3;
        if (p3Var != null) {
            p3Var.onContentChanged();
            p3Var.H();
        }
    }

    public final boolean C4() {
        int i10;
        int i11;
        int i12;
        int i13;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            if (L3()) {
                int i14 = f3Var.f21401u0;
                int i15 = f3Var.f21402v0;
                int i16 = f3Var.f21405y0;
                int i17 = f3Var.f21403w0;
                int i18 = f3Var.f21406z0;
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
                d1 I2 = I2(f3Var.f21401u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(f3Var.f21403w0, f3Var.f21406z0), I2.length())) < Math.max(0, Math.min(Math.max(f3Var.f21403w0, f3Var.f21406z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                d1 s22 = s2(f3Var.f21401u0);
                if (s22 != null) {
                    int i20 = f3Var.f21403w0;
                    int i21 = f3Var.f21406z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), s22.length())) < Math.max(0, Math.min(Math.max(i20, i21), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                d1 j42 = j4(f3Var.f21401u0);
                if (j42 != null) {
                    int i22 = f3Var.f21403w0;
                    int i23 = f3Var.f21406z0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), j42.length())) < Math.max(0, Math.min(Math.max(i22, i23), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = f3Var.f21401u0;
                int i25 = f3Var.f21404x0;
                int i26 = f3Var.f21403w0;
                int i27 = f3Var.f21406z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f46129m4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a y42 = y4(i28);
                        if (y42 != null) {
                            if (y42.f45790t == 0) {
                                TL_iv.PageBlock pageBlock = y42.f45775b;
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
        p3 p3Var = this.f46112e3;
        if (p3Var != null) {
            p3Var.B();
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
        f3 f3Var = this.f46124k3;
        if (f3Var != null && (i10 = f3Var.f21401u0) >= 0 && (y42 = y4(i10)) != null) {
            return y42;
        }
        return null;
    }

    public final int[] D4() {
        f3 f3Var = this.f46124k3;
        if (f3Var != null) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21404x0;
            if (i10 >= 0 && i11 >= 0) {
                a y42 = y4(i10);
                a y43 = y4(i11);
                if (y42 != null && y43 != null) {
                    ArrayList arrayList = this.f46120i3;
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
    public final void E1(f2.l1 l1Var) {
        p3 p3Var = this.f46112e3;
        if (p3Var != null && l1Var != null) {
            View view = l1Var.f5785a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.Q3 = p3Var.b(view.getHeight() + iArr[1]);
        }
    }

    public final void E2() {
        ArrayList arrayList;
        f3 f3Var = this.f46124k3;
        int i10 = f3Var.f21401u0;
        int i11 = f3Var.f21403w0;
        int i12 = f3Var.f21404x0;
        if (!W1(i10, i11, i12, f3Var.f21406z0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f46120i3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f46129m4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f45790t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                c2 c2Var = this.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f46122j3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f45781k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                x2();
                V3();
                s4();
                f3Var.f(false);
                this.V2.N(false);
                c2 c2Var2 = this.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                post(new j2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void E4(d1 d1Var) {
        d1Var.adaptiveCreateLinkDialog = this.f46116g3;
        d1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void F1(f2.l1 l1Var) {
        a aVar = this.P3;
        this.P3 = null;
        this.Q3 = false;
        if (aVar != null) {
            c2 c2Var = this.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            r4(aVar);
            c2 c2Var2 = this.G3;
            if (c2Var2 != null) {
                c2Var2.h();
            }
            p3 p3Var = this.f46112e3;
            if (p3Var != null) {
                p3Var.onContentChanged();
            }
        } else if (l1Var != null) {
            View view = l1Var.f5785a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean F2() {
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            f3Var.f(false);
            return true;
        } else if (this.f46115f4 == null) {
            return false;
        } else {
            M2();
            return true;
        }
    }

    public final void F4(vh.i5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.F4(vh.i5):void");
    }

    @Override
    public final void G1(f2.l1 l1Var) {
        int b10;
        i51 G;
        a aVar = null;
        if (l1Var != null && (b10 = l1Var.b()) >= 0 && (G = this.V2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.P3 = aVar;
        this.Q3 = false;
        p3 p3Var = this.f46112e3;
        if (p3Var != null) {
            p3Var.q();
        }
    }

    public final void G2() {
        f3 f3Var = this.f46124k3;
        if (f3Var != null) {
            f3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.W3;
        for (u4 u4Var : identityHashMap.values()) {
            u4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.X3;
        for (q4 q4Var : identityHashMap2.values()) {
            q4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i10;
        a y42;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f21401u0) == f3Var.f21404x0 && i10 >= 0 && i10 < this.f46129m4.size() && f3Var.f21402v0 == 1 && f3Var.f21405y0 == 1 && (y42 = y4(i10)) != null && v5.p(y42.f45775b)) {
            return true;
        }
        return false;
    }

    public final v5 G4() {
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21404x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && A3(y42.f45775b)) {
                return u2(i10);
            }
            return null;
        }
        return null;
    }

    public final int H2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f46120i3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f45779i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean H3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f46120i3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z4 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f45779i && !x3(aVar)) {
                        if (!aVar.f45781k.isEmpty() || v5.p(aVar.f45775b)) {
                            z4 = true;
                        }
                    }
                    i10++;
                }
                return z4;
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
                if (y42 != null && A3(y42.f45775b)) {
                    int i22 = i2(i10);
                    if (v2.d(i11, i13, i22, 0) < yh.d(i11, i13, i22, 0)) {
                        v5 u22 = u2(i10);
                        if (u22 != null) {
                            return u22.getEditText().getText();
                        }
                        return v5.A(y42.f45775b);
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
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21404x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z4 = false;
                while (i10 <= i11) {
                    a y42 = y4(i10);
                    if (y42 != null) {
                        if (C3(y42.f45775b)) {
                            z4 = true;
                        }
                    }
                    i10++;
                }
                return z4;
            }
        }
        return false;
    }

    public final boolean I4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.I4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean J3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.J3(int, int, int, int, int):boolean");
    }

    public final void J4(View view) {
        f2.l1 T;
        int b10;
        if (view != null && this.W2 != null && this.Z2 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.V2.H(b10) >= 0) {
            this.f46142x3 = true;
            f3 f3Var = this.f46124k3;
            if (f3Var.y()) {
                f3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.W2.r(T);
        }
    }

    public final boolean K3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z4 = false;
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
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void K4(a aVar, s sVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f10;
        u4 u4Var = (u4) this.W3.remove(sVar);
        if (u4Var != null) {
            u4Var.b();
        }
        IdentityHashMap identityHashMap = this.X3;
        q4 q4Var = (q4) identityHashMap.remove(sVar);
        if (q4Var != null) {
            q4Var.a();
        }
        sVar.f46150a = 1;
        sVar.f46153f = 0.0f;
        q4 q4Var2 = new q4(this.c3, photoEntry, new d3(aVar, sVar, this));
        identityHashMap.put(sVar, q4Var2);
        if (!q4Var2.f46094f && !q4Var2.h && !q4Var2.f46095n) {
            q4Var2.f46094f = true;
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
                videoEditedInfo2.estimatedSize = (int) ((f10 / 1000.0f) * 115200.0f);
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
                float f11 = i11;
                float f12 = i12;
                float max = Math.max(f11 / 854.0f, f12 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i17 = (int) (f11 / max);
                int i18 = (int) (f12 / max);
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
            q4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19205id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                q4Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(q4Var2.f46091a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                q4Var2.f46093c = messageObject;
                messageObject.videoEditedInfo = q4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(q4Var2.f46091a);
                notificationCenter.addObserver(q4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(q4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(q4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(q4Var2.f46093c, false, false, false);
                return;
            }
            q4Var2.b();
        }
    }

    public final boolean L3() {
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21404x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && (y42.f45775b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L4(a aVar, s sVar, String str, boolean z4, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.W3;
        u4 u4Var = (u4) identityHashMap.remove(sVar);
        if (u4Var != null) {
            u4Var.b();
        }
        u4 u4Var2 = new u4(this.c3, str, z4, i10, i11, i12, new e3(aVar, sVar, this));
        identityHashMap.put(sVar, u4Var2);
        u4Var2.d();
    }

    public final void M2() {
        if (this.f46143y3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f46143y3 = false;
        this.f46144z3 = false;
        this.A3 = null;
        this.B3 = null;
        o70 o70Var = this.f46117g4;
        if (o70Var != null) {
            this.f46117g4 = null;
            o70Var.u();
        }
        i5 i5Var = this.f46115f4;
        if (i5Var != null) {
            LinkedHashSet linkedHashSet = i5Var.E;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                i5Var.v.invalidate();
                i5Var.t();
            }
            this.f46115f4 = null;
        }
        this.f46121i4 = -1;
        this.f46119h4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.c3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f46120i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += Q3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Z2 = Z2();
        ?? obj = new Object();
        obj.d = i11;
        obj.f45854b = Z2.size() + obj.f45854b;
        for (int i12 = 0; i12 < Z2.size(); i12++) {
            d2.b((TL_iv.PageBlock) Z2.get(i12), 1, obj);
        }
        if (obj.f45853a > appGlobalConfig.richMessageLengthLimit.get() || obj.f45854b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f45855c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v5) {
            return ((v5) z12).getEditText().getText();
        }
        return v5.A(aVar.f45775b);
    }

    public final d1 N4(int i10, int i11) {
        View A4 = A4(i10);
        if (!(A4 instanceof i5)) {
            return null;
        }
        return ((i5) A4).l(i11);
    }

    public final int[] O3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.K3.size(); i12++) {
            int length = v5.z(((a) this.K3.get(i12)).f45775b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.K3.size() - 1;
        return new int[]{size, v5.z(((a) this.K3.get(size)).f45775b).length()};
    }

    public final d1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                return ((v5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f46120i3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (x3(aVar)) {
                    i11++;
                } else if (aVar.f45779i && i11 - 1 == 0) {
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
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                if (v5Var.getEditText().isFocused() || (v5Var.n() && v5Var.h.isFocused())) {
                    return v5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        boolean z4;
        int[] B4 = B4();
        if (B4 != null) {
            int i10 = B4[0];
            int i11 = B4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f46120i3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    c2 c2Var = this.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    if (H3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z10 = aVar.f45779i;
                            ArrayList arrayList2 = aVar.f45781k;
                            if (!z10 && !x3(aVar)) {
                                if (v5.p(aVar.f45775b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f45775b.text;
                                    aVar.f45775b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    android.support.v4.media.a.u(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = m0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z11 = aVar2.f45779i;
                            ArrayList arrayList3 = aVar2.f45781k;
                            if (!z11 && !x3(aVar2)) {
                                if (v5.p(aVar2.f45775b)) {
                                    long a10 = m0.a();
                                    TL_iv.RichText k10 = v5.k(aVar2.f45775b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f46122j3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f45775b.text;
                                    aVar2.f45775b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    x2();
                    V3();
                    s4();
                    f3 f3Var = this.f46124k3;
                    if (f3Var != null && f3Var.y()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.V2.N(false);
                    c2 c2Var2 = this.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    if (z4) {
                        post(new tf.h1(this, aVar3, aVar4, 11));
                    } else {
                        post(new j2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void R1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.R1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final i5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return U2((d1) findFocus);
        }
        return null;
    }

    public final void R4(vh.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.R4(vh.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
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
        for (int i12 = 0; i12 < this.f46120i3.size(); i12++) {
            for (s sVar : Q3((a) this.f46120i3.get(i12))) {
                if (sVar != null && (document = sVar.h) != null && document.f19190id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f46118h3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f19190id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = p4.f46073a;
        synchronized (p4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) p4.f46074b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean S4() {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.S4():boolean");
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        r3 r3Var;
        if (aVar != null && D3(aVar.f45775b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                c2 c2Var = this.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                s T3 = T3(photoEntry, str2);
                boolean c3 = q4.c(photoEntry);
                if (!photoEntry.isVideo && !c3) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (B3(aVar.f45775b)) {
                    g3(aVar.f45775b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    s sVar = aVar.f45778g;
                    if (sVar != null && sVar.f46150a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f45775b.caption;
                        h0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f45775b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f45778g);
                        aVar.h.add(T3);
                        aVar.f45778g = null;
                        aVar.f45775b = pageblockcollage;
                    } else {
                        aVar.f45775b = pageblockvideo;
                        aVar.f45778g = T3;
                    }
                }
                this.V2.N(false);
                n4(aVar);
                if (c3) {
                    K4(aVar, T3, photoEntry);
                    r3Var = this;
                } else {
                    r3Var = this;
                    r3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                c2 c2Var2 = r3Var.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                r3Var.f46112e3.onContentChanged();
            }
        }
    }

    public final int T2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f46120i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f45779i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (x3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f45775b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f45779i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f45775b;
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
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.T4(android.view.View, float, float):boolean");
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            c2 c2Var = this.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f46118h3;
            if (richMessage2 == null) {
                this.f46118h3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f46118h3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            W2(arrayList4, richMessage.blocks, this.f46122j3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    v4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f46120i3;
                int size = arrayList5.size();
                a Q2 = Q2();
                if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
                    TL_iv.PageBlock pageBlock = Q2.f45775b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && v5.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                V3();
                s4();
                this.V2.N(false);
                c2 c2Var2 = this.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                p3 p3Var = this.f46112e3;
                if (p3Var != null) {
                    p3Var.onContentChanged();
                }
            }
        }
    }

    public final a U3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f46129m4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f45779i) {
                    if (aVar.f45790t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f45775b;
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

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        Editable A;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f46120i3;
            if (arrayList.indexOf(aVar2) >= 0 && !x3(aVar2) && !aVar2.f45779i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f45775b;
                if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
                    v5 u22 = u2(arrayList.indexOf(aVar2));
                    if (u22 != null) {
                        A = u22.getEditText().getText();
                    } else {
                        A = v5.A(aVar2.f45775b);
                    }
                    v5.d(pageBlock, A);
                    TL_iv.RichText k10 = v5.k(aVar2.f45775b);
                    if (k10 != null && v5.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                R4(aVar2, pageBlock, i10, i11, z4, z10);
            }
        }
    }

    public final a V1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f46129m4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f45790t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void V2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                v5Var.f46240f.n();
                v5Var.h.n();
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
            ArrayList arrayList = this.f46120i3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f45781k.isEmpty() && v5.p(aVar.f45775b)) {
                    long a2 = m0.a();
                    TL_iv.RichText k10 = v5.k(aVar.f45775b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f46122j3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f45781k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f45775b.text;
                    aVar.f45775b = pageblockparagraph;
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
        U4(aVar2, pageBlock, aVar2.f45776c, aVar2.d, aVar2.e, aVar2.f45777f);
    }

    public final boolean W1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.W1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean W3(vh.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.W3(vh.a, boolean):boolean");
    }

    public final void W4(a aVar, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            U4(aVar2, aVar2.f45775b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f45776c);
        if (i10 == 2) {
            i11 = Math.max(1, aVar2.d);
        } else {
            i11 = 0;
        }
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        TL_iv.PageBlock pageBlock = aVar2.f45775b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z4 && aVar2.f45777f) {
            z10 = true;
        } else {
            z10 = false;
        }
        U4(aVar2, pageBlock, max, i11, z4, z10);
    }

    public final void X1() {
        v5 v5Var;
        a aVar;
        s5 s5Var;
        this.V2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v5) && (aVar = (v5Var = (v5) childAt).f46245x) != null && (s5Var = v5Var.f46246y) != null) {
                v5Var.g(aVar, s5Var, v5Var.B);
            }
        }
    }

    public final void X3() {
        int length;
        int d;
        int d10;
        int length2;
        int d11;
        int d12;
        int length3;
        int d13;
        int d14;
        int length4;
        int d15;
        int d16;
        d1 N4;
        int length5;
        int d17;
        int d18;
        boolean L3 = L3();
        f3 f3Var = this.f46124k3;
        if (L3) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21402v0;
            if (i11 == f3Var.f21405y0 && (N4 = N4(i10, i11)) != null && (d17 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length5 = N4.length()), 0)) < (d18 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length5, 0))) {
                c2 c2Var = this.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                if (x5.h(N4.getText(), d17, d18)) {
                    x5.n(N4.getText(), d17, d18);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    c2 c2Var2 = this.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(d17, d18);
                N4.makeSelectedDate();
            }
        } else if (y3()) {
            int i12 = f3Var.f21401u0;
            d1 I2 = I2(i12);
            if (I2 != null && (d15 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length4 = I2.length()), 0)) < (d16 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length4, 0))) {
                c2 c2Var3 = this.G3;
                if (c2Var3 != null) {
                    c2Var3.d();
                }
                if (x5.h(I2.getText(), d15, d16)) {
                    x5.n(I2.getText(), d15, d16);
                    I2.invalidateEffects();
                    e4(i12);
                    c2 c2Var4 = this.G3;
                    if (c2Var4 != null) {
                        c2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(d15, d16);
                I2.makeSelectedDate();
            }
        } else if (w3()) {
            int i13 = f3Var.f21401u0;
            d1 s22 = s2(i13);
            if (s22 != null && (d13 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length3 = s22.length()), 0)) < (d14 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length3, 0))) {
                c2 c2Var5 = this.G3;
                if (c2Var5 != null) {
                    c2Var5.d();
                }
                if (x5.h(s22.getText(), d13, d14)) {
                    x5.n(s22.getText(), d13, d14);
                    s22.invalidateEffects();
                    d4(i13);
                    c2 c2Var6 = this.G3;
                    if (c2Var6 != null) {
                        c2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(d13, d14);
                s22.makeSelectedDate();
            }
        } else if (G3()) {
            int i14 = f3Var.f21401u0;
            d1 j42 = j4(i14);
            if (j42 != null && (d11 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length2 = j42.length()), 0)) < (d12 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length2, 0))) {
                c2 c2Var7 = this.G3;
                if (c2Var7 != null) {
                    c2Var7.d();
                }
                if (x5.h(j42.getText(), d11, d12)) {
                    x5.n(j42.getText(), d11, d12);
                    j42.invalidateEffects();
                    f4(i14);
                    c2 c2Var8 = this.G3;
                    if (c2Var8 != null) {
                        c2Var8.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(d11, d12);
                j42.makeSelectedDate();
            }
        } else {
            v5 G4 = G4();
            if (G4 == null || (d = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length = G4.getEditText().length()), 0)) >= (d10 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length, 0))) {
                return;
            }
            c2 c2Var9 = this.G3;
            if (c2Var9 != null) {
                c2Var9.d();
            }
            if (x5.h(G4.getEditText().getText(), d, d10)) {
                x5.n(G4.getEditText().getText(), d, d10);
                G4.getEditText().invalidateEffects();
                G4.x();
                c2 c2Var10 = this.G3;
                if (c2Var10 != null) {
                    c2Var10.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(d, d10);
            G4.getEditText().makeSelectedDate();
        }
    }

    public final a X4() {
        f3 f3Var;
        int i10;
        a Q2 = Q2();
        if (Q2 == null && (f3Var = this.f46124k3) != null && f3Var.y() && (i10 = f3Var.f21401u0) == f3Var.f21404x0) {
            return y4(i10);
        }
        return Q2;
    }

    public final boolean Y1(int i10, int i11) {
        f3 f3Var;
        ArrayList arrayList = this.K3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.K3.get(O3[0]);
            if (O3[0] != O32[0] && max != max2) {
                View z12 = z1(aVar);
                View z13 = z1(this.K3.get(O32[0]));
                if ((z12 instanceof v5) && (z13 instanceof v5)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f46120i3;
                        int size = arrayList2.size();
                        f3Var = this.f46124k3;
                        if (i12 >= size) {
                            break;
                        }
                        f3Var.Y(i12, v5.z(((a) arrayList2.get(i12)).f45775b));
                        i12++;
                    }
                    v5 v5Var = (v5) z12;
                    int length = v5Var.getEditText().length();
                    if (O3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!f3Var.k0(v5Var, 0, O3[1], length)) {
                        v5Var.B();
                        return true;
                    }
                    f3Var.c0(0, O32[1], (v5) z13);
                    return true;
                }
            } else {
                View z14 = z1(aVar);
                if (z14 instanceof v5) {
                    v5 v5Var2 = (v5) z14;
                    v5Var2.B();
                    d1 editText = v5Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(O3[1], length2), Math.min(O32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Y2(int i10, int i11, int i12, boolean z4) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z10;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f46120i3;
            a aVar = (a) arrayList2.get(i15);
            boolean z11 = aVar.f45779i;
            ArrayList arrayList3 = aVar.f45781k;
            if (z11) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l10 = (Long) arrayList3.get(i12);
                long longValue = l10.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f45781k.size() <= i12 || ((Long) aVar2.f45781k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i15, i16, i12 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f46122j3.get(l10);
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
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f45775b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i15);
                pageblockdetails.blocks = Y2(i15 + 1, Math.min(P3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = P3 + 1;
            } else {
                int i17 = aVar.f45776c;
                if (i17 <= 0) {
                    J2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock k22 = k2(i15, i17, i13, i14, z10, iArr);
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
        if (!z4) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) kh.a2.i(1, arrayList))) {
                android.support.v4.media.a.u(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i10) {
        int i11;
        c2 c2Var;
        int i12;
        boolean z4;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int d;
        int d10;
        boolean z10;
        int i16;
        int length2;
        int d11;
        int d12;
        boolean z11;
        int i17;
        int length3;
        int d13;
        int d14;
        boolean z12;
        int i18;
        c2 c2Var2;
        int i19;
        int i20;
        int i21;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            boolean L3 = L3();
            p3 p3Var = this.f46112e3;
            int i22 = 0;
            if (L3) {
                int i23 = f3Var.f21401u0;
                int i24 = f3Var.f21402v0;
                int i25 = f3Var.f21405y0;
                int i26 = f3Var.f21403w0;
                int i27 = f3Var.f21406z0;
                boolean K3 = K3(i10, i23, i24, i26, i25, i27);
                if (!K3) {
                    i18 = w2(i10);
                } else {
                    i18 = 0;
                }
                c2 c2Var3 = this.G3;
                if (c2Var3 != null) {
                    c2Var3.d();
                }
                this.F3 = true;
                int i28 = i24;
                boolean z13 = false;
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
                            z13 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.F3 = false;
                if (z13 && (c2Var2 = this.G3) != null) {
                    c2Var2.h();
                }
                p3Var.n();
                if (z13) {
                    o4();
                }
            } else if (y3()) {
                int i30 = f3Var.f21401u0;
                d1 I2 = I2(i30);
                if (I2 != null && (d13 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length3 = I2.length()), 0)) < (d14 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length3, 0))) {
                    if ((I2.getCurrentStyle(d13, d14) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2 c2Var4 = this.G3;
                    if (c2Var4 != null) {
                        c2Var4.d();
                    }
                    this.F3 = true;
                    if (z12) {
                        int w22 = w2(i10);
                        if (w22 != 0) {
                            I2.removeStyle(w22, d13, d14);
                        }
                        I2.addStyle(i10, d13, d14);
                    } else {
                        I2.removeStyle(i10, d13, d14);
                    }
                    this.F3 = false;
                    e4(i30);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    c2 c2Var5 = this.G3;
                    if (c2Var5 != null) {
                        c2Var5.h();
                    }
                    p3Var.n();
                    o4();
                }
            } else if (w3()) {
                int i31 = f3Var.f21401u0;
                d1 s22 = s2(i31);
                if (s22 != null && (d11 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length2 = s22.length()), 0)) < (d12 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length2, 0))) {
                    if ((s22.getCurrentStyle(d11, d12) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i17 = w2(i10);
                    } else {
                        i17 = 0;
                    }
                    c2 c2Var6 = this.G3;
                    if (c2Var6 != null) {
                        c2Var6.d();
                    }
                    this.F3 = true;
                    if (z11) {
                        if (i17 != 0) {
                            s22.removeStyle(i17, d11, d12);
                        }
                        s22.addStyle(i10, d11, d12);
                    } else {
                        s22.removeStyle(i10, d11, d12);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i31);
                    this.F3 = false;
                    c2 c2Var7 = this.G3;
                    if (c2Var7 != null) {
                        c2Var7.h();
                    }
                    p3Var.n();
                    o4();
                }
            } else if (G3()) {
                int i32 = f3Var.f21401u0;
                d1 j42 = j4(i32);
                if (j42 != null && (d = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length = j42.length()), 0)) < (d10 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length, 0))) {
                    if ((j42.getCurrentStyle(d, d10) & i10) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i16 = w2(i10);
                    } else {
                        i16 = 0;
                    }
                    c2 c2Var8 = this.G3;
                    if (c2Var8 != null) {
                        c2Var8.d();
                    }
                    this.F3 = true;
                    if (z10) {
                        if (i16 != 0) {
                            j42.removeStyle(i16, d, d10);
                        }
                        j42.addStyle(i10, d, d10);
                    } else {
                        j42.removeStyle(i10, d, d10);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i32);
                    this.F3 = false;
                    c2 c2Var9 = this.G3;
                    if (c2Var9 != null) {
                        c2Var9.h();
                    }
                    p3Var.n();
                    o4();
                }
            } else {
                int i33 = f3Var.f21401u0;
                int i34 = f3Var.f21404x0;
                int i35 = f3Var.f21403w0;
                int i36 = f3Var.f21406z0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f46129m4.size()) {
                    int i37 = i10;
                    boolean J3 = J3(i37, i33, i35, i34, i36);
                    boolean z14 = !J3;
                    if (!J3) {
                        i11 = w2(i37);
                    } else {
                        i11 = 0;
                    }
                    c2 c2Var10 = this.G3;
                    if (c2Var10 != null) {
                        c2Var10.d();
                    }
                    this.F3 = true;
                    int i38 = i33;
                    boolean z15 = false;
                    while (i38 <= i34) {
                        a y42 = y4(i38);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.f45775b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = 0;
                                }
                                z4 = z15;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = i210;
                                }
                                int max3 = Math.max(i22, Math.min(i13, i210));
                                int max4 = Math.max(i22, Math.min(i14, i210));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z15 = z4;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    v5 u22 = u2(i38);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.x4 styleDelegate = u22.getStyleDelegate();
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
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(v5.A(y42.f45775b));
                                        if (!J3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            x5.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        x5.o(spannableStringBuilder, i15, max4, i37, z14, null);
                                        v5.d(y42.f45775b, spannableStringBuilder);
                                    }
                                    z15 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z4 = z15;
                        z15 = z4;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z16 = z15;
                    this.F3 = false;
                    if (z16 && (c2Var = this.G3) != null) {
                        c2Var.h();
                    }
                    p3Var.n();
                    if (z16) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f10, float f11) {
        TL_iv.pageTableCell m9;
        i5 i5Var = this.f46115f4;
        if (this.f46143y3 && i5Var != null && this.f46139u3 == i5Var && (m9 = i5Var.m((int) ((f10 - i5Var.getLeft()) - getLeft()), (int) ((f11 - i5Var.getTop()) - getTop()))) != null && m9 != this.B3) {
            this.B3 = m9;
            i5Var.w(this.A3, m9);
        }
    }

    public final ArrayList Z2() {
        return Y2(0, this.f46120i3.size(), 0, false);
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.Z3(android.view.View):void");
    }

    public final void Z4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    c2 c2Var = this.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    v5 u22 = u2(this.f46120i3.indexOf(aVar));
                    if (u22 != null && (aVar2 = u22.f46245x) != null) {
                        u22.I(aVar2.f45775b, true);
                        u22.E = null;
                        u22.C();
                    }
                    c2 c2Var2 = this.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                }
            }
        }
    }

    public final void a2() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.f46120i3;
            if (i11 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i11);
                ArrayList arrayList7 = aVar.f45780j;
                ArrayList arrayList8 = aVar.f45781k;
                arrayList7.clear();
                if (aVar.f45779i) {
                    if (!arrayList.isEmpty()) {
                        android.support.v4.media.a.u(1, arrayList);
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
                    int max = Math.max(i10, aVar.f45776c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
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
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i15 < arrayList2.size()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && z10) {
                                if (((Boolean) arrayList3.get(i15)).booleanValue() != z4) {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                while (arrayList2.size() > i15) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(m0.a()));
                                if (z10) {
                                    z13 = z4;
                                } else {
                                    z13 = false;
                                }
                                arrayList3.add(Boolean.valueOf(z13));
                                arrayList4.add(0);
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i15)).getClass();
                            if (z10) {
                                if (((Long) arrayList5.get(i15)).longValue() != 0 && E3(aVar.f45775b)) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (z12) {
                                    arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                    arrayList5.set(i15, Long.valueOf(aVar.f45774a));
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
                        boolean z14 = ((TL_iv.pageBlockDetails) aVar.f45775b).open;
                        m0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (v5.p(aVar.f45775b)) {
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
        ArrayList arrayList = this.f46120i3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) kh.a2.i(1, arrayList);
        }
        if (aVar != null && !E3(aVar.f45775b) && !aVar.f45779i && !x3(aVar) && !K2(aVar.f45775b)) {
            if (!(z1(aVar) instanceof v5)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        c2 c2Var = this.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.V2.N(false);
        c2 c2Var2 = this.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        post(new j2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int d;
        int d10;
        int length2;
        int d11;
        int d12;
        int length3;
        int d13;
        int d14;
        int length4;
        int d15;
        int d16;
        d1 N4;
        int length5;
        int d17;
        int d18;
        boolean L3 = L3();
        p3 p3Var = this.f46112e3;
        f3 f3Var = this.f46124k3;
        if (L3) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21402v0;
            if (i11 == f3Var.f21405y0 && (N4 = N4(i10, i11)) != null && (d17 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length5 = N4.length()), 0)) < (d18 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length5, 0))) {
                if (x5.h(N4.getText(), d17, d18)) {
                    c2 c2Var = this.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    x5.n(N4.getText(), d17, d18);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    c2 c2Var2 = this.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    p3Var.n();
                    o4();
                    return;
                }
                c2 c2Var3 = this.G3;
                if (c2Var3 != null) {
                    c2Var3.d();
                }
                if (x5.g(N4.getText(), d17, d18)) {
                    x5.m(N4.getText(), d17, d18);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    c2 c2Var4 = this.G3;
                    if (c2Var4 != null) {
                        c2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(d17, d18);
                o3(false);
                E4(N4);
            }
        } else if (y3()) {
            int i12 = f3Var.f21401u0;
            d1 I2 = I2(i12);
            if (I2 != null && (d15 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length4 = I2.length()), 0)) < (d16 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length4, 0))) {
                if (x5.h(I2.getText(), d15, d16)) {
                    c2 c2Var5 = this.G3;
                    if (c2Var5 != null) {
                        c2Var5.d();
                    }
                    x5.n(I2.getText(), d15, d16);
                    I2.invalidateEffects();
                    e4(i12);
                    c2 c2Var6 = this.G3;
                    if (c2Var6 != null) {
                        c2Var6.h();
                    }
                    p3Var.n();
                    o4();
                    return;
                }
                c2 c2Var7 = this.G3;
                if (c2Var7 != null) {
                    c2Var7.d();
                }
                if (x5.g(I2.getText(), d15, d16)) {
                    x5.m(I2.getText(), d15, d16);
                    I2.invalidateEffects();
                    e4(i12);
                    c2 c2Var8 = this.G3;
                    if (c2Var8 != null) {
                        c2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(d15, d16);
                o3(false);
                E4(I2);
            }
        } else if (w3()) {
            int i13 = f3Var.f21401u0;
            d1 s22 = s2(i13);
            if (s22 != null && (d13 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length3 = s22.length()), 0)) < (d14 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length3, 0))) {
                if (x5.h(s22.getText(), d13, d14)) {
                    c2 c2Var9 = this.G3;
                    if (c2Var9 != null) {
                        c2Var9.d();
                    }
                    x5.n(s22.getText(), d13, d14);
                    s22.invalidateEffects();
                    d4(i13);
                    c2 c2Var10 = this.G3;
                    if (c2Var10 != null) {
                        c2Var10.h();
                    }
                    p3Var.n();
                    o4();
                    return;
                }
                c2 c2Var11 = this.G3;
                if (c2Var11 != null) {
                    c2Var11.d();
                }
                if (x5.g(s22.getText(), d13, d14)) {
                    x5.m(s22.getText(), d13, d14);
                    s22.invalidateEffects();
                    d4(i13);
                    c2 c2Var12 = this.G3;
                    if (c2Var12 != null) {
                        c2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(d13, d14);
                o3(false);
                E4(s22);
            }
        } else if (G3()) {
            int i14 = f3Var.f21401u0;
            d1 j42 = j4(i14);
            if (j42 != null && (d11 = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length2 = j42.length()), 0)) < (d12 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length2, 0))) {
                if (x5.h(j42.getText(), d11, d12)) {
                    c2 c2Var13 = this.G3;
                    if (c2Var13 != null) {
                        c2Var13.d();
                    }
                    x5.n(j42.getText(), d11, d12);
                    j42.invalidateEffects();
                    f4(i14);
                    c2 c2Var14 = this.G3;
                    if (c2Var14 != null) {
                        c2Var14.h();
                    }
                    p3Var.n();
                    o4();
                    return;
                }
                c2 c2Var15 = this.G3;
                if (c2Var15 != null) {
                    c2Var15.d();
                }
                if (x5.g(j42.getText(), d11, d12)) {
                    x5.m(j42.getText(), d11, d12);
                    j42.invalidateEffects();
                    f4(i14);
                    c2 c2Var16 = this.G3;
                    if (c2Var16 != null) {
                        c2Var16.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(d11, d12);
                o3(false);
                E4(j42);
            }
        } else {
            v5 G4 = G4();
            if (G4 == null || (d = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length = G4.getEditText().length()), 0)) >= (d10 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length, 0))) {
                return;
            }
            if (x5.h(G4.getEditText().getText(), d, d10)) {
                c2 c2Var17 = this.G3;
                if (c2Var17 != null) {
                    c2Var17.d();
                }
                x5.n(G4.getEditText().getText(), d, d10);
                G4.getEditText().invalidateEffects();
                G4.x();
                c2 c2Var18 = this.G3;
                if (c2Var18 != null) {
                    c2Var18.h();
                }
                p3Var.n();
                o4();
                return;
            }
            c2 c2Var19 = this.G3;
            if (c2Var19 != null) {
                c2Var19.d();
            }
            if (x5.g(G4.getEditText().getText(), d, d10)) {
                x5.m(G4.getEditText().getText(), d, d10);
                G4.getEditText().invalidateEffects();
                G4.x();
                c2 c2Var20 = this.G3;
                if (c2Var20 != null) {
                    c2Var20.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(d, d10);
            o3(false);
            E4(G4.getEditText());
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            c2 c2Var = this.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z4 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            s sVar = new s();
            aVar.f45778g = sVar;
            sVar.f46152c = true;
            long j10 = document.f19190id;
            z4 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z4) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                s sVar2 = aVar.f45778g;
                sVar2.f46155i = document;
                sVar2.e = str;
                sVar2.f46150a = 1;
                sVar2.f46153f = 0.0f;
            } else {
                sVar.h = document;
                sVar.f46155i = document;
                sVar.f46150a = 2;
                pageblockaudio.audio_id = j10;
            }
            u3(aVar);
            if (z4) {
                s sVar3 = aVar.f45778g;
                String str2 = sVar3.e;
                IdentityHashMap identityHashMap = this.W3;
                u4 u4Var = (u4) identityHashMap.remove(sVar3);
                if (u4Var != null) {
                    u4Var.b();
                }
                u4 u4Var2 = new u4(this.c3, str2, document, new c3(aVar, sVar3, this));
                identityHashMap.put(sVar3, u4Var2);
                u4Var2.d();
            }
            c2 c2Var2 = this.G3;
            if (c2Var2 != null) {
                c2Var2.h();
            }
            this.f46112e3.onContentChanged();
        }
    }

    public final void b3(a aVar, boolean z4) {
        int i10;
        View z12 = z1(aVar);
        if (z12 instanceof a5) {
            d1 d1Var = ((a5) z12).f45805r;
            d1Var.r();
            if (z4) {
                i10 = d1Var.length();
            } else {
                i10 = 0;
            }
            d1Var.setSelection(i10);
            return;
        }
        c3(aVar, z4);
    }

    public final void b4() {
        d1 editText;
        Runnable f2Var;
        int length;
        final int d;
        final int d10;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            if (L3()) {
                int i10 = f3Var.f21401u0;
                int i11 = f3Var.f21402v0;
                if (i11 == f3Var.f21405y0) {
                    editText = N4(i10, i11);
                    f2Var = new k2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (y3()) {
                int i12 = f3Var.f21401u0;
                editText = I2(i12);
                f2Var = new e2(this, i12, 3);
            } else if (w3()) {
                int i13 = f3Var.f21401u0;
                editText = s2(i13);
                f2Var = new e2(this, i13, 0);
            } else if (G3()) {
                int i14 = f3Var.f21401u0;
                editText = j4(i14);
                f2Var = new e2(this, i14, 1);
            } else {
                v5 G4 = G4();
                if (G4 != null) {
                    editText = G4.getEditText();
                    f2Var = new f2(G4, 0);
                } else {
                    return;
                }
            }
            final d1 d1Var = editText;
            final Runnable runnable = f2Var;
            if (d1Var != null && (d = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length = d1Var.length()), 0)) <= (d10 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length, 0))) {
                Editable text = d1Var.getText();
                int i15 = r.h;
                String str = null;
                if (text != null) {
                    r[] rVarArr = (r[]) text.getSpans(d, d10, r.class);
                    if (rVarArr.length > 0) {
                        str = rVarArr[0].f46097a;
                    }
                }
                if (str == null) {
                    str = d1Var.getText().subSequence(d, d10).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = j6.G6;
                f6 f6Var = this.f46110d3;
                final int v02 = j6.v0(i16, f6Var);
                p.U(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        r a2;
                        String str2 = (String) obj;
                        r3 r3Var = r3.this;
                        r3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = r.a(str2, v02, dp)) == null) {
                            return;
                        }
                        c2 c2Var = r3Var.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        f3 f3Var2 = r3Var.f46124k3;
                        if (f3Var2 != null) {
                            f3Var2.f(false);
                        }
                        d1 d1Var2 = d1Var;
                        d1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = d1Var2.getText();
                        int max = Math.max(0, Math.min(d, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(d10, text2.length())), spannableString);
                        runnable.run();
                        c2 c2Var2 = r3Var.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                        }
                        r3Var.f46112e3.onContentChanged();
                        int min = Math.min(max + 1, d1Var2.length());
                        d1Var2.r();
                        r3Var.post(new q2(d1Var2, min, 3));
                    }
                }, f6Var);
            }
        }
    }

    public final void b5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.b5(java.lang.CharSequence):void");
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
            tL_document.f19190id = 0L;
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

    public final void c3(a aVar, boolean z4) {
        View z12 = z1(aVar);
        if (z12 instanceof i5) {
            i5 i5Var = (i5) z12;
            d1 d1Var = i5Var.f45941r;
            z5 z5Var = i5Var.C;
            if (z5Var != null) {
                if (!z4) {
                    d1Var.r();
                    d1Var.setSelection(0);
                    return;
                } else if (!z5Var.f46343g.isEmpty()) {
                    l5 m9 = i5Var.v.m((TL_iv.pageTableCell) kh.a2.i(1, i5Var.C.f46343g));
                    if (m9 != null) {
                        d1 d1Var2 = m9.f46006a;
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
        if (z4 && (z12 instanceof v5)) {
            v5 v5Var = (v5) z12;
            if (v5Var.n()) {
                v5Var.i();
                return;
            }
        }
        d1 R3 = R3(z12);
        if (R3 == null) {
            d3(aVar);
            return;
        }
        R3.r();
        if (z4) {
            R3.setSelection(R3.length());
        }
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.c4():void");
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document != null) {
            c2 c2Var = this.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z4 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            s sVar = new s();
            aVar.f45778g = sVar;
            sVar.d = true;
            long j10 = document.f19190id;
            z4 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z4) {
                if (!TextUtils.isEmpty(str) && e2.c.t(str)) {
                    s sVar2 = aVar.f45778g;
                    sVar2.h = document;
                    sVar2.e = str;
                    sVar2.f46150a = 1;
                    sVar2.f46153f = 0.0f;
                } else {
                    return;
                }
            } else {
                sVar.h = document;
                sVar.f46150a = 2;
                pageblockdocument.document_id = j10;
            }
            u3(aVar);
            if (z4) {
                s sVar3 = aVar.f45778g;
                IdentityHashMap identityHashMap = this.W3;
                u4 u4Var = (u4) identityHashMap.remove(sVar3);
                if (u4Var != null) {
                    u4Var.b();
                }
                u4 u4Var2 = new u4(this.c3, str, document, new b3(this, sVar3, aVar, str));
                identityHashMap.put(sVar3, u4Var2);
                u4Var2.d();
            }
            c2 c2Var2 = this.G3;
            if (c2Var2 != null) {
                c2Var2.h();
            }
            this.f46112e3.onContentChanged();
        }
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v5) {
            ((v5) z12).B();
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
        float f10;
        boolean z4;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f46129m4;
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
                    ArrayList arrayList3 = aVar4.f45781k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f46131n4 == null) {
                    am0 am0Var = new am0(this);
                    this.f46131n4 = am0Var;
                    am0Var.a(null, null, null, this.f46110d3, 1);
                    i8.a(this.f46131n4, this.f46110d3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    float f12 = 0.0f;
                    int i16 = 0;
                    boolean z10 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f13 = 1.0f;
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
                                ArrayList arrayList4 = aVar.f45781k;
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
                        if (!z10 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                        } else {
                            int k42 = k4(i15, aVar5, true);
                            l11 = l10;
                            int k43 = k4(i15, aVar6, false);
                            if (f12 - f11 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.y3.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f11, B, f12 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f46131n4.b(canvas, rectF, floor, floor, floor, f13);
                                    f10 = f13;
                                    this.f46131n4.e(canvas, rectF, f10);
                                    z10 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                            z10 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z10) {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z4 = true;
                                f10 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z4 = z10;
                            }
                            if (aVar != null && aVar == this.P3) {
                                z10 = z4;
                            } else {
                                float y10 = view.getY();
                                float height = view.getHeight() + y10;
                                if (y10 < f11) {
                                    f11 = y10;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f13 = Math.min(f10, view.getAlpha());
                                z10 = z4;
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
                        f13 = f10;
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
            a aVar = this.Y3;
            String str = null;
            this.Y3 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                FileLog.e(e);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z4 = contains;
            int i10 = this.f46133o4;
            this.f46133o4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(this, uri, z4, str2, i10, aVar));
        }
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v5) {
            v5 v5Var = (v5) z12;
            v5Var.B();
            d1 editText = v5Var.getEditText();
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
            ((TL_iv.pageBlockDetails) y42.f45775b).title = x5.f(I2.getText());
        }
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        r3 r3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        c2 c2Var = this.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        boolean c3 = q4.c(photoEntry);
        if (!photoEntry.isVideo && !c3) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f45778g = T3(photoEntry, str2);
        u3(aVar);
        if (c3) {
            K4(aVar, aVar.f45778g, photoEntry);
            r3Var = this;
        } else {
            r3Var = this;
            r3Var.L4(aVar, aVar.f45778g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        r3Var.f46112e3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v5) {
            v5 v5Var = (v5) z12;
            v5Var.B();
            v5Var.getEditText().setSelection(0);
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            q0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof v5) {
            ((v5) A4).w();
        }
    }

    public final void g2(i5 i5Var) {
        i5 i5Var2 = this.f46115f4;
        if (i5Var2 != null && i5Var2 != i5Var) {
            LinkedHashSet linkedHashSet = i5Var2.E;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                i5Var2.v.invalidate();
                i5Var2.t();
            }
        }
        this.f46115f4 = i5Var;
        this.f46144z3 = false;
        this.f46121i4 = -1;
        this.f46119h4 = -1;
        i5Var.setCellSelectionListener(this.f46123j4);
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y()) {
            f3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i10, int i11) {
        l5 m9;
        View A4 = A4(i10);
        if (A4 instanceof i5) {
            i5 i5Var = (i5) A4;
            if (i11 == 0) {
                i5Var.u();
                return;
            }
            TL_iv.pageTableCell h = i5Var.h(i11);
            if (h != null && (m9 = i5Var.getGrid().m(h)) != null) {
                z5.d(h, m9.f46006a.getText());
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

    public g4 getMapDelegate() {
        return this.f46107a4;
    }

    public View getOverlayView() {
        return this.f46126l3;
    }

    public m9 getTextSelectionHelper() {
        return this.f46124k3;
    }

    public final i3 h2() {
        int i10;
        int i11;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y() && !G3()) {
            a y42 = y4(f3Var.f21401u0);
            ArrayList arrayList = this.f46120i3;
            int indexOf = arrayList.indexOf(y42);
            int indexOf2 = arrayList.indexOf(y4(f3Var.f21404x0));
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
                    if (aVar.f45779i || x3(aVar)) {
                        return null;
                    }
                }
                return new i3(this, i10, i11, f3Var.f21403w0, f3Var.f21406z0);
            }
            return null;
        }
        return null;
    }

    public final boolean h3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.h3(android.view.KeyEvent):boolean");
    }

    public final int i2(int i10) {
        d1 I2 = I2(i10);
        if (I2 != null) {
            return I2.length();
        }
        v5 u22 = u2(i10);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i10);
        if (y42 == null) {
            return 0;
        }
        return v5.z(y42.f45775b).length();
    }

    public final boolean i3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.i3(android.view.MotionEvent):boolean");
    }

    public final int i4(int i10) {
        Layout layout;
        View A4 = A4(i10);
        if (!(A4 instanceof v5) || (layout = ((v5) A4).getEditText().getLayout()) == null) {
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

    public final boolean j3(vh.i5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.j3(vh.i5, int, int):boolean");
    }

    public final d1 j4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof v5) {
            return ((v5) A4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock k2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.k2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean k3() {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.k3():boolean");
    }

    public final boolean l2() {
        d1 editText;
        int length;
        int d;
        int d10;
        e4[] e4VarArr;
        f3 f3Var = this.f46124k3;
        if (f3Var == null || !f3Var.y() || f3Var.f21401u0 != f3Var.f21404x0) {
            return false;
        }
        if (L3()) {
            int i10 = f3Var.f21401u0;
            int i11 = f3Var.f21402v0;
            if (i11 != f3Var.f21405y0) {
                return false;
            }
            editText = N4(i10, i11);
        } else if (y3()) {
            editText = I2(f3Var.f21401u0);
        } else if (w3()) {
            editText = s2(f3Var.f21401u0);
        } else if (G3()) {
            editText = j4(f3Var.f21401u0);
        } else {
            v5 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (d = v2.d(f3Var.f21403w0, f3Var.f21406z0, (length = editText.length()), 0)) >= (d10 = yh.d(f3Var.f21403w0, f3Var.f21406z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && d < d10) {
            for (e4 e4Var : (e4[]) text.getSpans(d, d10, e4.class)) {
                if (text.getSpanStart(e4Var) < d10 && text.getSpanEnd(e4Var) > d) {
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
            if (n2((a) this.f46120i3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46120i3;
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

    public final boolean m4(int i10, int i11, boolean z4) {
        boolean z10;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f46120i3;
            if (i11 < arrayList.size()) {
                c2 c2Var = this.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                if (z4) {
                    z10 = false;
                    while (i11 >= i10) {
                        if (q3(i11, true, true)) {
                            z10 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f45776c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f45776c < aVar.f45776c)) {
                        return false;
                    }
                    z10 = false;
                    while (i10 <= i11) {
                        if (q3(i10, false, true)) {
                            z10 = true;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    s4();
                    if (findFocus() instanceof d1) {
                        X1();
                    } else {
                        this.V2.N(false);
                    }
                    c2 c2Var2 = this.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f46120i3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f45776c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f45775b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f45776c < aVar2.f45776c) {
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
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                v5Var.f46240f.hideActionMode();
                v5Var.h.hideActionMode();
            } else if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                k5 k5Var = i5Var.v;
                i5Var.f45941r.hideActionMode();
                for (int i11 = 0; i11 < k5Var.getChildCount(); i11++) {
                    View childAt2 = k5Var.getChildAt(i11);
                    if (childAt2 instanceof l5) {
                        ((l5) childAt2).f46006a.hideActionMode();
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
        if (z12 instanceof o4) {
            o4 o4Var = (o4) z12;
            ArrayList arrayList = o4Var.f46055y;
            if (o4Var.f46283a != null) {
                o4Var.n();
                if (o4Var.T >= arrayList.size()) {
                    o4Var.T = Math.max(0, arrayList.size() - 1);
                }
                o4Var.o(false);
                o4Var.requestLayout();
                o4Var.invalidate();
            }
        }
    }

    public final boolean o2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f46120i3;
            if (i10 < arrayList.size() && E3(((a) arrayList.get(i10)).f45775b) && ((a) arrayList.get(i10 - 1)).f45776c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3(boolean z4) {
        f3 f3Var = this.f46124k3;
        if (f3Var != null) {
            if (z4) {
                f3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(f3Var.f22696r0);
                f3Var.v();
            }
        }
        if (z4) {
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
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.J3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.J3);
        this.X2 = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        View F;
        int i14 = i13 - i11;
        int i15 = this.H3;
        if (i15 > 0 && i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        if (z10) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new e2(this, dp, 2));
                }
            }
        }
        this.H3 = i14;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (q2((a) this.f46120i3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i10) {
        if (((a) this.f46120i3.get(i10)).f45776c + 1 <= MessagesController.getInstance(this.c3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void p4(int i10) {
        ArrayList arrayList = this.f46120i3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f45776c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof v5) {
                    ((v5) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f46120i3).indexOf(aVar)) < 0 || aVar.f45776c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f45776c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q3(int i10, boolean z4, boolean z10) {
        boolean z11;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f46120i3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z4) {
                    if (aVar2.f45776c > 0) {
                        t2(i10);
                        return true;
                    }
                } else if (aVar2.f45776c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f45775b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if ((z11 || o2(i10)) && p3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z11) {
                            aVar2.f45776c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f45776c = aVar.f45776c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f45777f = false;
                        return true;
                    }
                } else if ((z10 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f45776c >= aVar2.f45776c)) && p3(i10)) {
                    aVar2.f45776c++;
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
        if (B3(aVar.f45775b)) {
            ArrayList g32 = g3(aVar.f45775b);
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
            w51 w51Var = this.V2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f45775b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
                aVar.f45775b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f45778g = (s) aVar.h.get(0);
                aVar.h = null;
                w51Var.N(true);
                n4(aVar);
                return;
            }
            w51Var.N(true);
            n4(aVar);
            return;
        }
        r4(aVar);
    }

    public final boolean r2() {
        c2 c2Var = this.G3;
        if (c2Var != null) {
            if (c2Var.e || !c2Var.f45833b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z4) {
        a aVar;
        int i10;
        int i11;
        int[] D4 = D4();
        if (D4 != null && (i10 = D4[0]) != (i11 = D4[1])) {
            m4(i10, i11, z4);
            return;
        }
        if (D4 == null) {
            aVar = D2();
        } else {
            aVar = (a) this.f46120i3.get(D4[0]);
        }
        if (aVar != null) {
            W3(aVar, z4);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.f46120i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.V2.N(true);
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
        ArrayList arrayList3 = aVar.f45781k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l10 = (Long) arrayList3.get(i11);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f46122j3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f45790t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f45781k.add((Long) arrayList3.get(i12));
                }
                int i13 = z4.f46338a;
                i51 J = i51.J(z4.class);
                J.G = aVar2;
                J.H = this.f46109c4;
                arrayList2.add(J);
                this.f46129m4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46120i3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f45776c > 0 && aVar.d > 0 && !E3(aVar.f45775b)) {
                    int i11 = aVar.f45776c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f45776c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !E3(aVar2.f45775b)) {
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

    public void setAdaptiveLinkDialogs(boolean z4) {
        this.f46116g3 = z4;
    }

    public void setAllowTapAboveContent(boolean z4) {
        this.O3 = z4;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f46114f3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.K3 = new ArrayList();
        ArrayList arrayList = this.f46120i3;
        W2(arrayList, w4.b(charSequence), this.f46122j3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.K3.add((a) arrayList.get(size));
        }
        this.V2.N(false);
    }

    public final void t2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f46120i3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f45776c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f45776c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f45777f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f45776c) > i12) {
                    aVar.f45776c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void t3() {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.t3():void");
    }

    public final void t4(String str) {
        f3 f3Var = this.f46124k3;
        W1(f3Var.f21401u0, f3Var.f21403w0, f3Var.f21404x0, f3Var.f21406z0, str.split("\n", -1));
    }

    public final v5 u2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m9 = this.U2.m(i10);
        if (!(m9 instanceof v5)) {
            return null;
        }
        return (v5) m9;
    }

    public final void u3(vh.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r3.u3(vh.a):void");
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
            sVar.f46152c = true;
            sVar.f46150a = 2;
            sVar.h = S2;
            sVar.f46155i = S2;
            return sVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f46150a = 2;
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
                sVar3.f46151b = true;
                sVar3.f46150a = 2;
                sVar3.h = S23;
                sVar3.f46160n = pageblockvideo.spoiler;
                while (i10 < S23.attributes.size()) {
                    if (S23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i10);
                        sVar3.f46156j = tL_documentAttributeVideo.f19191w;
                        sVar3.f46157k = tL_documentAttributeVideo.h;
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
                        if (i12 < this.f46120i3.size()) {
                            for (s sVar4 : Q3((a) this.f46120i3.get(i12))) {
                                if (sVar4 != null && (photo = sVar4.f46154g) != null && photo.f19208id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f46118h3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f19208id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = p4.f46073a;
                            synchronized (p4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) p4.f46073a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                s sVar5 = new s();
                sVar5.f46150a = 2;
                sVar5.f46154g = photo;
                sVar5.f46160n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    sVar5.f46156j = closestPhotoSizeWithSize.f19209w;
                    sVar5.f46157k = closestPhotoSizeWithSize.h;
                }
                return sVar5;
            }
        }
    }

    public final void v2() {
        G2();
        this.f46118h3 = null;
        this.Y3 = null;
        this.Z3 = null;
        this.G3 = new c2(this.f46127l4);
        z4();
        this.G3.j();
        p3 p3Var = this.f46112e3;
        if (p3Var != null) {
            p3Var.H();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f46118h3 != null && aVar != null && (pageBlock = aVar.f45775b) != null) {
            if (B3(pageBlock)) {
                ArrayList g32 = g3(aVar.f45775b);
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
            s u43 = u4(aVar.f45775b);
            if (u43 != null) {
                aVar.f45778g = u43;
            }
        }
    }

    public final boolean w3() {
        int i10;
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f21401u0) == f3Var.f21404x0 && i10 >= 0 && i10 < this.f46129m4.size()) {
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
            if (B3(aVar.f45775b)) {
                ArrayList g32 = g3(aVar.f45775b);
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
                TL_iv.PageBlock pageBlock2 = aVar.f45775b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    s u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.f45778g = u43;
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
            arrayList = this.f46120i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z4 = aVar.f45779i;
            ArrayList arrayList2 = aVar.f45781k;
            if (!z4) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new Object());
                }
            }
            i10++;
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f45781k;
            if (arrayList3.size() == 1 && (aVar2.f45775b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f45775b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f46122j3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f45775b = pageblockblockquote;
                    arrayList3.clear();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void x4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f4) {
                y yVar = (y) ((f4) childAt);
                yVar.f46284b.a(yVar.f46283a, new rh.e(yVar, 8));
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
            ArrayList arrayList2 = this.f46120i3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f45775b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f45778g) != null && sVar.b() && (document2 = aVar.f45778g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f45775b).document_id = document2.f19190id;
                }
                for (s sVar2 : Q3(aVar)) {
                    if (sVar2.b() && (document = sVar2.h) != null) {
                        long j10 = document.f19190id;
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
        f3 f3Var = this.f46124k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f21401u0) == f3Var.f21404x0 && x3(y4(i10))) {
            return true;
        }
        return false;
    }

    public final a y4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f46129m4;
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
            ArrayList arrayList2 = this.f46120i3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i10))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f19190id))) {
                    arrayList.add(sVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.f46120i3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.V2.N(false);
    }
}

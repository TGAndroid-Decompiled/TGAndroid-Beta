package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.kv0;
public final class m extends org.telegram.ui.ActionBar.j {
    public final o f38775a;

    public m(o oVar) {
        this.f38775a = oVar;
    }

    @Override
    public final void b(int i10) {
        String str;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        o oVar = this.f38775a;
        HashSet hashSet = oVar.f38793w;
        if (i10 == -1) {
            kVar = ((n2) oVar).actionBar;
            if (kVar.s()) {
                kVar2 = ((n2) oVar).actionBar;
                kVar2.r();
                hashSet.clear();
                AndroidUtilities.forEachViews((RecyclerView) oVar.f30163a, (Utilities.Callback<View>) new ai.i(22));
                return;
            }
            oVar.finishFragment();
        } else if (i10 == R.id.menu_delete) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet3 = new HashSet();
            Iterator it = hashSet.iterator();
            while (true) {
                MessageObject messageObject = null;
                int i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                ArrayList arrayList2 = oVar.d.f38725a;
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i12);
                    i12++;
                    MessageObject messageObject2 = (MessageObject) obj;
                    if (messageObject2 != null && messageObject2.getId() == intValue) {
                        messageObject = messageObject2;
                        break;
                    }
                }
                i iVar = oVar.e;
                if (iVar != null && messageObject == null) {
                    ArrayList arrayList3 = iVar.f38725a;
                    int size2 = arrayList3.size();
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        MessageObject messageObject3 = (MessageObject) obj2;
                        if (messageObject3 != null && messageObject3.getId() == intValue) {
                            messageObject = messageObject3;
                            break;
                        }
                    }
                }
                if (messageObject != null) {
                    arrayList.add(messageObject);
                    hashSet3.add(Integer.valueOf(messageObject.getId()));
                    hashSet2.add(k.a(messageObject));
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oVar.getParentActivity(), 0, oVar.getResourceProvider());
            alertDialog$Builder.f18409a.R = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
            if (hashSet3.size() == 1) {
                str = "AreYouSureUnsaveSingleMessage";
            } else {
                str = "AreYouSureUnsaveFewMessages";
            }
            alertDialog$Builder.f18409a.T = LocaleController.getString(str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kv0(21, oVar, hashSet3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (i10 == R.id.menu_link) {
            oVar.d0();
        }
    }
}

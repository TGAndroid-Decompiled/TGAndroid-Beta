package org.telegram.ui.web;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.di1;

public final class n extends org.telegram.ui.ActionBar.j {

    public final p f43917a;

    public n(p pVar) {
        this.f43917a = pVar;
    }

    @Override
    public final void b(int i10) {
        p pVar = this.f43917a;
        HashSet hashSet = pVar.f43934w;
        if (i10 == -1) {
            if (!((n2) pVar).actionBar.t()) {
                pVar.finishFragment();
                return;
            }
            ((n2) pVar).actionBar.s();
            hashSet.clear();
            AndroidUtilities.forEachViews((RecyclerView) pVar.f28261a, (d5.d) new j4.w0(14));
            return;
        }
        if (i10 != R.id.menu_delete) {
            if (i10 == R.id.menu_link) {
                pVar.d0();
                return;
            }
            return;
        }
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
            int iIntValue = ((Integer) it.next()).intValue();
            ArrayList arrayList2 = pVar.d.f43873a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                MessageObject messageObject2 = (MessageObject) obj;
                if (messageObject2 != null && messageObject2.getId() == iIntValue) {
                    messageObject = messageObject2;
                    break;
                }
            }
            j jVar = pVar.f43929e;
            if (jVar != null && messageObject == null) {
                ArrayList arrayList3 = jVar.f43873a;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    MessageObject messageObject3 = (MessageObject) obj2;
                    if (messageObject3 != null && messageObject3.getId() == iIntValue) {
                        messageObject = messageObject3;
                        break;
                    }
                }
            }
            if (messageObject != null) {
                arrayList.add(messageObject);
                hashSet3.add(Integer.valueOf(messageObject.getId()));
                hashSet2.add(l.a(messageObject));
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pVar.getParentActivity(), 0, pVar.getResourceProvider());
        alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
        alertDialog$Builder.f22702a.P = LocaleController.getString(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new di1(1, pVar, hashSet3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}

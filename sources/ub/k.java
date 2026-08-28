package ub;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class k {
    public static final Logger f48187a = Logger.getLogger(k.class.getName());
    public static final HashMap f48188b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(e.class);
        hashSet.add(m.class);
        hashSet.add(b.class);
        hashSet.add(h.class);
        hashSet.add(j.class);
        hashSet.add(l.class);
        hashSet.add(a.class);
        hashSet.add(i.class);
        hashSet.add(g.class);
        hashSet.add(d.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            f fVar = (f) cls.getAnnotation(f.class);
            int[] tags = fVar.tags();
            int objectTypeIndication = fVar.objectTypeIndication();
            Map map = (Map) f48188b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i9 : tags) {
                map.put(Integer.valueOf(i9), cls);
            }
            f48188b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i9, ByteBuffer byteBuffer) {
        b bVar;
        int k10 = p2.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = f48188b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k10));
        Logger logger = f48187a;
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e10) {
                Level level = Level.SEVERE;
                logger.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i9 + " and tag " + k10, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        } else {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i9) + " and tag " + Integer.toHexString(k10) + " found: " + cls);
            bVar = new Object();
        }
        bVar.f48162a = k10;
        int a2 = p2.b.a(byteBuffer.get());
        bVar.f48163b = a2 & 127;
        int i10 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = p2.b.a(byteBuffer.get());
            i10++;
            bVar.f48163b = (bVar.f48163b << 7) | (a2 & 127);
        }
        bVar.f48164c = i10;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(bVar.f48163b);
        bVar.b(slice);
        byteBuffer.position(byteBuffer.position() + bVar.f48163b);
        return bVar;
    }
}

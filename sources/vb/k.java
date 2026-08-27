package vb;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k {

    public static final Logger f48872a = Logger.getLogger(k.class.getName());

    public static final HashMap f48873b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
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
        for (Class cls : hashSet) {
            f fVar = (f) cls.getAnnotation(f.class);
            int[] iArrTags = fVar.tags();
            int iObjectTypeIndication = fVar.objectTypeIndication();
            Map map = (Map) f48873b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i10 : iArrTags) {
                map.put(Integer.valueOf(i10), cls);
            }
            f48873b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b nVar;
        int iK = p2.b.k(byteBuffer);
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = f48873b;
        Map map2 = (Map) map.get(numValueOf);
        if (map2 == null) {
            map2 = (Map) map.get(-1);
        }
        Class cls = (Class) map2.get(Integer.valueOf(iK));
        Logger logger = f48872a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(iK) + " found: " + cls);
            nVar = new n();
        } else {
            try {
                nVar = (b) cls.newInstance();
            } catch (Exception e9) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + iK, (Throwable) e9);
                throw new RuntimeException(e9);
            }
        }
        nVar.f48847a = iK;
        int iA = p2.b.a(byteBuffer.get());
        nVar.f48848b = iA & 127;
        int i11 = 1;
        while ((iA >>> 7) == 1) {
            iA = p2.b.a(byteBuffer.get());
            i11++;
            nVar.f48848b = (nVar.f48848b << 7) | (iA & 127);
        }
        nVar.f48849c = i11;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(nVar.f48848b);
        nVar.b(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + nVar.f48848b);
        return nVar;
    }
}

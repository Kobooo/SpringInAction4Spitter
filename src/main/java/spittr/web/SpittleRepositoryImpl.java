//package spittr.web;
//
//import org.springframework.stereotype.Component;
//import spittr.Spittle;
//import spittr.data.SpittleRepository;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Component
//public class SpittleRepositoryImpl
//
//      //  implements SpittleRepository
//{
//
//    @Override
//    public List<Spittle> findRecentSpittles() {
//        return null;
//    }
//
//    @Override
//    public List<Spittle> findSpittles(long max, int count) {
//
//        List<Spittle> spittles = new ArrayList<Spittle>();
//        for (int i = 0; i < count; i++) {
//            spittles.add(new Spittle("Spittle" + i, new Date()));
//        }
//        return spittles;
//
//    }
//
//    @Override
//    public Spittle findOne(long spittleId) {
//        return null;
//    }
//
//    @Override
//    public void save(Spittle spittle) {
//
//    }
//
//}